package ss6.bai_tap.circle;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public double getRadius() {
        return this.radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAreaCircle(){
        return Math.PI*Math.pow(radius,2);
    }


    public String toadd() {
        return  "darius=" + radius +
                ", color='" + color + '\'' ;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + "'"+
                ", AreaCircle= "+getAreaCircle() +
                '}';
    }



}
