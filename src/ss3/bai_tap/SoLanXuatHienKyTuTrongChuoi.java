package ss3.bai_tap;

import java.util.Scanner;

public class SoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "Nguyen Minh Hoang";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn kiểm tra");
        char character = scanner.next().charAt(0);
        int count = 0;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            if(character == (str.charAt(i))){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+ character+" trong chuỗi " + str + " là: "+count);
    }
}
