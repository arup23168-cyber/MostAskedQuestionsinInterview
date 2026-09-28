import java.util.*;
import java.util.stream.Collectors;

class Transaction {

    String account;
    String type;
    String status;
    double amount;

    Transaction(String account, String type,
                String status, double amount) {

        this.account = account;
        this.type = type;
        this.status = status;
        this.amount = amount;
    }
}

public class TransactionAggregation {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(

                new Transaction("A101", "CREDIT", "SUCCESS", 1000),
                new Transaction("A101", "DEBIT", "SUCCESS", 300),
                new Transaction("A101", "CREDIT", "FAILED", 500),
                new Transaction("A102", "CREDIT", "SUCCESS", 2000)
        );

        Map<String, Double> result =
                transactions.stream()
                        .filter(Objects::nonNull)
                        .filter(t -> "SUCCESS".equals(t.status))
                        .collect(Collectors.groupingBy(
                                t -> t.account,
                                LinkedHashMap::new,
                                Collectors.summingDouble(t ->

                                        "CREDIT".equals(t.type)
                                                ? t.amount
                                                : -t.amount
                                )
                        ));

        System.out.println(result);
    }
}
