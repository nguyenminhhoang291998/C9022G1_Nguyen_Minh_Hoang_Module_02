package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {1,0,11,3,2,5,0,0,0,0};
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí cần chèn: ");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = size-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index]=number;
        System.out.println(Arrays.toString(arr));
    }
}
