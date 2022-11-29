import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        do{
            String emailPattern = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+([.][A-Za-z0-9]+)$";
            System.out.print("Input your email(email@address.com): ");
            String input = scanner.nextLine();
            flag = input.matches(emailPattern);
            if(!flag) System.out.println("Invalid data!");
        }while (!flag);
        System.out.println("Valid data");

    }
}



