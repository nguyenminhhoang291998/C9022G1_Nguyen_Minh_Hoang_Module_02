package sss7.thuc_hanh.shape;

import ss6.bai_tap.circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double darius) {
        super(darius);
    }

    public ComparableCircle(double darius, String color, boolean filled) {
        super(darius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() >= o.getRadius()) return 1;
        else return -1;
    }
}
