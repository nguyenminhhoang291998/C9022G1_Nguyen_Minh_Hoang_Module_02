package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertionSortAscending {
    public static void main(String[] args) {
        int[] arr = {4,2,3,8,5,6};
        int pos, x;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            x = arr[i];
            pos = i;
            while (pos>0 && x<arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
                System.out.println(Arrays.toString(arr));
            }
            arr[pos] =x;
            System.out.println("The array after sort ascending is: " +Arrays.toString(arr));
        }

    }
}
