package ss11_stack_queue.bai_tap.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();
        String[] array = string.split("");
        System.out.println(Arrays.toString(array));
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : array) {
            stack.add(s);
            queue.add(s);
        }

        int size = stack.size();
        boolean flag = true;
        for (int i = 0; i < size ; i++) {
            if(!Objects.equals(stack.pop(), queue.poll())){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Đây là chuỗi Palindrome.");
        }else{
            System.out.println("Đây không phải là chuỗi Palindrome.");}

    }
}
