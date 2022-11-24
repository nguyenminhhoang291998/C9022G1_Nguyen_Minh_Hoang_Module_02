package giai_thuat;

import java.util.Scanner;

public class Ngay_23_11_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n (n<=20): ");
        int n = Integer.parseInt(scanner.nextLine());
        int x = 2;
        while (n<0 || n>20){
            System.out.println("Nhập lại n (n<=20):");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
