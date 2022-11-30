package ss19_string_regex.practice.validate_account;

import java.util.Scanner;

public class ValidateAccount {
    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        do{
            System.out.println("Nhập tài khoản: ");
            String email = scanner.nextLine();
            flag = email.matches(ACCOUNT_REGEX);
            if(!flag) System.out.println("Tài khoản không hợp lệ.");
        }while (!flag);
        System.out.println("Tài khoản hợp lệ.");
    }
}
