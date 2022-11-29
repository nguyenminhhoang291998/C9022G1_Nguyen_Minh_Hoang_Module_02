package ss15_exception.exercise;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
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
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangleException("Độ dài các cạnh của tam giác không thể nhỏ hơn 0.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Độ dài các cạnh không thỏa mãn điều kiện là tam giác.");
        } else {
            System.out.println("Đây là một tam giác.");
        }
    }
}
