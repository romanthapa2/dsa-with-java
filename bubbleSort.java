// Bubble sort works by comparing two next values,if second number is smaller then swap with first number otherwise
// dont swap. after 1st inner iteration the last value will be highest and the second largest value will be in second last
// position after 2nd iteration and so on.

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
