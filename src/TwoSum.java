import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            if (map.containsKey(required)) {

                System.out.println(
                        map.get(required) + ", " + i);

                return;
            }

            map.put(arr[i], i);
        }
    }
}
