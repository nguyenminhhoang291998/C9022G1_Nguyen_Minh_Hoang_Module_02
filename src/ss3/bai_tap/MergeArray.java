package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1: ");
        int length1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Nhập phần tử thứ "+ (i+1)+" của mảng 1: ");
            arr1[i] =  Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Nhập số lượng phần tử mảng 2: ");
        int length2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("Nhập phần tử thứ "+ (i+1)+" của mảng 2: ");
            arr2[i] =  Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr2));

        int length3 = length1 + length2;
        int[] arr3 = new int[length3];
        for (int i = 0; i < length1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i <length2 ; i++) {
            arr3[length1+i]= arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
