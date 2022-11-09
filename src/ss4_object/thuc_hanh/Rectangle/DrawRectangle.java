package ss4_object.thuc_hanh.Rectangle;

import java.util.Scanner;

public class DrawRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        double height = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.toString());
        System.out.println("Diện tích là: "+ rectangle.getArea());
        System.out.println("Chu vi là: "+ rectangle.getPerimeter());

    }
}
