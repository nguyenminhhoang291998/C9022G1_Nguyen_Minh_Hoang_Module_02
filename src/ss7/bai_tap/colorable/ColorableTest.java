package ss7.bai_tap.colorable;

import ss7.bai_tap.resizeable.Circle;
import ss7.bai_tap.resizeable.Rectangle;
import ss7.bai_tap.resizeable.Shape;
import ss7.bai_tap.resizeable.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(1.5,"red",true,false);
        shapes[1] = new Rectangle(1.4,2.5,"blue",false,true);
        shapes[2] = new Square(3.4,"yellow",true,true);
        shapes[3] = new Square(2.4,"black",false,false);
        for (Shape shape : shapes){
            if(shape instanceof Circle){
                System.out.println(shape.toString() + ", Area of circle: " + shape.getArea());
            }else if(shape instanceof Rectangle){
                System.out.println(shape.toString() + ", Area of rectangle: " + shape.getArea());
            }else if(shape.isColorable())
            {System.out.println(shape.toString() + ", Area of Square: " + shape.getArea());
            ((Square) shape).howToColor();}
                else {System.out.println(shape.toString() + ", Area of Square: " + shape.getArea());
            }

        }
    }
}
