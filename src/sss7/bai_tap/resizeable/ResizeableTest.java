package sss7.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        double min = 1;
        double max = 100;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.5,"red",true,false);
        shapes[1] = new Rectangle(1.4,2.5,"blue",false,false);
        shapes[2] = new Square(3.4,"yellow",true,true);

        System.out.println("Pre-resize: ");
        for(Shape shape : shapes) {
            System.out.println(shape.toString());
        };
        System.out.println("After-resize: ");
        for(Shape shape : shapes) {
            shape.resize(Math.random()*((max - min) + 1) + min);
            System.out.println(shape.toString());
        };
    }



}
