
import java.util.Arrays;

public class inserstionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 8};
        for (int i = 1; i < arr.length; i++){
            int key=arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("the sorted array is " + Arrays.toString(arr));
    }
}
