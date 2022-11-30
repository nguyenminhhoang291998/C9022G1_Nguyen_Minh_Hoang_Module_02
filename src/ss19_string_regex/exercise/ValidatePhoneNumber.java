package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String PATTEN_REGEX = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        do {
            System.out.println("Enter phone number by form (xx)-(0xxxxxxxxx): ");
            String name = scanner.nextLine();
            flag = name.matches(PATTEN_REGEX);
            if(!flag) System.out.println("Invalid data");
        } while (!flag);
        System.out.println("Valid data");
    }

}
