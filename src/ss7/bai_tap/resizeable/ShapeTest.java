package ss7.bai_tap.resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false,false);
        System.out.println(shape);
    }
}
