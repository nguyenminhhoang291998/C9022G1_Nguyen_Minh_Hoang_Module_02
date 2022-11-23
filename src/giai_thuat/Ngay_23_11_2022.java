package giai_thuat;

import java.util.Scanner;

public class Ngay_23_11_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n (n<=20): ");
        int n = Integer.parseInt(scanner.nextLine());
        int fi0 = 1;
        int fi1 = 1;
        int fin = 0;
        int x =2;
        while (n<0 || n>20){
            System.out.println("Nhập lại n (n<=20):");
            n = Integer.parseInt(scanner.nextLine());
        }
        while(x<=n) {
            fin = fi0 +fi1;
            fi0 = fi1;
            fi1 = fin;
            x++;
        }
        System.out.println(fin);
    }

}
