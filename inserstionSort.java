// let array = {5, 2, 9, 1, 8};
// we start from here
// let sorted = [5] and unsorted = [2,9,1,8]
// inserstion sort works by comparing sorted and unsorted values first of all 5 and  2 if value first value is greater then 
// we shift right and get the 2 in the current position. likewise after 2nd iteration 
// sorted will be = [2,5] and unsorted will be [9,1,8] 
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
