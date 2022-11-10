package ss5.bai_tap.access_modifier;

public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

     double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

}
