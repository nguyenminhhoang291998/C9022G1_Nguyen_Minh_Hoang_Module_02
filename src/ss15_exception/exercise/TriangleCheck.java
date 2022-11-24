package ss15_exception.exercise;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ hai: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ ba: ");
        int c = Integer.parseInt(scanner.nextLine());
        TriangleCheck triangleCheck = new TriangleCheck();

        try {
            triangleCheck.check(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }

    private void check(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && (a + b > c || a + c > b || b + c > a)) {
            System.out.println("Đây là 1 tam giác");
        } else {
            throw new IllegalTriangleException();
        }
    }
}