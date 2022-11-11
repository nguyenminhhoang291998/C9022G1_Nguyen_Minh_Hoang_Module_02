package ss6.bai_tap.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1.0f,2.4f,2f,5f);
        System.out.println(point.toString());
        point.move();
        System.out.println(point.toString());
    }
}
