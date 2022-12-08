import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println(localDate);
    }
}



