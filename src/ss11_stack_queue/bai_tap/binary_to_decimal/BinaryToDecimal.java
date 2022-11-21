package ss11_stack_queue.bai_tap.binaryToDecimal;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập số cần chuyển đổi: ");
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        while (decimal!=0){
            stack.add(String.valueOf(decimal%2));
            decimal = decimal / 2;
        }

        int size = stack.size();
        for (int i = size; i >0 ; i--) {
            System.out.print(stack.pop());
        }
    }
}
