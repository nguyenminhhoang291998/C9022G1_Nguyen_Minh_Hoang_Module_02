package sss7.thuc_hanh.shape;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(1);
        circles[1] = new ComparableCircle(1,"aa",true);
        circles[2] = new ComparableCircle(0.4,"indigo",false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

    }


}
