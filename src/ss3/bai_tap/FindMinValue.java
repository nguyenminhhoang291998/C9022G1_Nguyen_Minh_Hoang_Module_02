package ss3.bai_tap;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length;  i++) {
            System.out.println("Nhập giá trị tại vị trí " + (i +1) + " là: " );
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int min = arr[0];
        for (int i = 0; i < length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
