package restro.exception;

import java.util.Scanner;

public class DemoHandleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number1 = 0;
        int number2 = 0;
        int result;
        String msg = "Dài quá 50 kí tự";
        try {
            checkMaxLength(str);
        } catch (MaxLengthException e) {
            System.err.println(e.getMessage());
        }

//        try {
//            result = number1 / number2;
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Trong finally");
//        }
//        System.out.println("C0922I1");
//        do {
//            System.out.println("nhap vao 1 so nguyen");
//            try {
//                number1 = Integer.parseInt(scanner.nextLine());
//                number2 = Integer.parseInt(scanner.nextLine());
//                result = number1 / number2;
//                break;
//            } catch (NumberFormatException | ArithmeticException e) {
//                System.out.println(e.getMessage());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("abc");
//            }
//        } while (true);
    }

    public static void checkMaxLength (String str) throws MaxLengthException {
        if(str.length()  > 50){
            throw new MaxLengthException();
        }
    }
}
