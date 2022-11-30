import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        do{
            String phoneNumberPatten = "[A|C|P][0-9]{4}[G-M]";
            System.out.println("Nhập sđt (xxx-xx-0xxxxxxx): ");
            String phoneNumber = scanner.nextLine();
            flag = phoneNumber.matches(phoneNumberPatten);
            if(!flag) System.out.println("SĐT Không đúng");

        }while (!flag);
        System.out.println("SĐT đúng");
    }
}



