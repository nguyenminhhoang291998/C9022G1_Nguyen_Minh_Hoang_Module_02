package ss1.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println(" Nhập số tiền USD: ");
        int valueUsd = scanner.nextInt();
        System.out.println(valueUsd + " USD bằng "+ valueUsd*rate +" VNĐ");

    }
}
