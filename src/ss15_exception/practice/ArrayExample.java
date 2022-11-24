package ss15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("DS phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        do{
            try {
                System.out.println("Giá trị của phần tử có chỉ số " + x + " là "+ arr[x]);
                break;
            }catch (IndexOutOfBoundsException e){
                System.out.println("Chỉ số vượt quá giới hạn của mảng");
                System.out.println("Nhập lại: ");
                x = scanner.nextInt();
            }
        }while (true);
    }
}
