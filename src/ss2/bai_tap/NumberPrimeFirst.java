package ss2.bai_tap;

import java.util.Scanner;

public class NumberPrimeFirst {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Nhập số lượng số nguyên tố đầu tiên muốn hiển thị: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int N = 2;
        while (count<number){

                boolean check = true;
            for (int i = 2; i <= Math.sqrt(N) ; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }if(check){
                count++;
                System.out.println(N);

            }
            N++;

        }
    }

}
