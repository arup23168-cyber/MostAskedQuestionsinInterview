import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = new int[arr.length];

        int prefix = 1;

        for (int i = 0; i < arr.length; i++) {

            result[i] = prefix;

            prefix *= arr[i];
        }

        int suffix = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            result[i] *= suffix;

            suffix *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
