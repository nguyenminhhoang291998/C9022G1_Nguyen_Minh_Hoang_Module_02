package ss11_stack_queue.bai_tap.reverse_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng trước khi đảo: "+Arrays.toString(array));

        for (int i = 0; i < n ;i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo: "+Arrays.toString(array));


        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String string = new String(scanner.nextLine());
        String[] arr = string.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }
        string = " ";
        System.out.println(wStack.size());
        int size = wStack.size();
        for (int i = 0; i < size; i++) {
            string += (wStack.pop()) + " ";
        }
        System.out.println("Chuỗi sau khi đảo: " + string);
    }
}
