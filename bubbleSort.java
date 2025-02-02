

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j=1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
