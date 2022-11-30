package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidateNameOfClass {
    private static final String PATTEN_REGEX = "^[C|A|P]\\d{4}[G-M]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        do {
            System.out.println("Enter name of class: ");
            String name = scanner.nextLine();
            flag = name.matches(PATTEN_REGEX);
            if(!flag) System.out.println("Invalid data");
        } while (!flag);
        System.out.println("Valid data");
    }

}
