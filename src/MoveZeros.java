import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {2, 3, 0, 1, 0, 1, 2, 0, 6};

        int index = 0;

        for (int num : arr) {

            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
