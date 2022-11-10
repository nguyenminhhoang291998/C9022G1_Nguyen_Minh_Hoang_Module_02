package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của mảng: ");
        int column = Integer.parseInt(sc.nextLine());
        float[][] arr = new float[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập giá trị tại vị trí " + "["+i+"]"+"["+j+"]: " );
                arr[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println("Nhập cột muốn tính tổng: ");
        int column1 = Integer.parseInt(sc.nextLine());
        float sum = 0.0f;
        for (int i = 0; i < row; i++) {
            sum+= arr[i][column1];
        }
        System.out.println("Tổng các phần tử ở cột "+column1 + " là: " +sum);
    }
}
