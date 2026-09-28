import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 30, 20, 50, 40, 50);

        int secondHighest =
                numbers.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElseThrow();

        System.out.println(secondHighest);
    }
}
