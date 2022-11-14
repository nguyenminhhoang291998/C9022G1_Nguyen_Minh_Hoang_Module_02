package ss6.bai_tap.circle;

import sss7.thuc_hanh.shape.ComparableCircle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Yellow") {

        };
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(3.0,"Red",2.5);
        System.out.println(cylinder.toString());
    }}
