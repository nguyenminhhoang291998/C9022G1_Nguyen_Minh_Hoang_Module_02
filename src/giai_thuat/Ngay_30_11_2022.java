package giai_thuat;

public class Ngay_30_11_2022 {
    public static void main(String[] args) {
        String data="";
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2 +1; j++) {
                if(j==1 || (j==2*i +1)){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 4; i<=j; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2 +1; j++) {
                if(j==1 || (j==2*i +1)){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
