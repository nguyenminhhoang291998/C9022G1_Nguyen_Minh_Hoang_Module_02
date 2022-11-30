package ss19_string_regex.practice.validate_email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$";

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validates(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        System.out.println("Enter email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println(emailExample.validates(email));
    }
}
