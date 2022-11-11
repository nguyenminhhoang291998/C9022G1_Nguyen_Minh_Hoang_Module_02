package ss6.bai_tap.point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.1f,4);
        System.out.println(point2D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(1.2f,2.3f,4.3f);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
