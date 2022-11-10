package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[length][length];

        for (int i = 0; i < length;  i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Nhập giá trị tại vị trí " + "["+i+"]"+"["+j+"]: " );
                arr[i][j] = Integer.parseInt(sc.nextLine());

            }
        }
        System.out.println(Arrays.deepToString(arr));

        int sum = 0;
        for (int i = 0; i < length; i++) {
                    sum += arr[i][i];
        }
        System.out.println("Tổng các số ở đường chéo là: " +sum);
    }
}
