package sss7.bai_tap.colorable;

import sss7.bai_tap.resizeable.Circle;
import sss7.bai_tap.resizeable.Rectangle;
import sss7.bai_tap.resizeable.Shape;
import sss7.bai_tap.resizeable.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.5,"red",true,false);
        shapes[1] = new Rectangle(1.4,2.5,"blue",false,true);
        shapes[2] = new Square(3.4,"yellow",true,true);
        for (Shape shape : shapes){
            System.out.println(shape.getArea());
            if(shape.isColorable()){
                shape.howToColor();
            }else {
                System.out.println("Not colorable");
            }
        }
    }
}
