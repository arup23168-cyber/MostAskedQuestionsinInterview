public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int num = arr[i];

            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            result = Math.max(result, max);
        }

        System.out.println(result);
    }
}
