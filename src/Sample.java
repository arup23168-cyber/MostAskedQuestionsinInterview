import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample{

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(10,20,20,30,40,10,30,50);

        List<Integer> dublicate=numbers.stream()
                .collect(Collectors.groupingBy(n ->n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(dublicate);

    }
}
