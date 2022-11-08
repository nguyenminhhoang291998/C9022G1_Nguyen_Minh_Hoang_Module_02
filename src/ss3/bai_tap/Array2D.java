package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của mảng: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập giá trị tại vị trí " + "["+i+"]"+"["+j+"]: " );
                arr[i][j] = Integer.parseInt(sc.nextLine());

            }
        }
        System.out.println(Arrays.deepToString(arr));

        int max = arr[0][0];
        String indexMax = "";
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                    indexMax = "["+i+"]"+"["+j+"]";
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
        System.out.println("Vị trí giá trị lớn nhất là: " + indexMax);

    }
}
