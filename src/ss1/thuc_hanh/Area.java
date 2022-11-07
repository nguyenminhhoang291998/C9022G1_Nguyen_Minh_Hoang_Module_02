package ss1.thuc_hanh;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        height = scanner.nextFloat();

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();

        float area = width * height;
        System.out.println("Diện tích là: "+ area);
    }
}
