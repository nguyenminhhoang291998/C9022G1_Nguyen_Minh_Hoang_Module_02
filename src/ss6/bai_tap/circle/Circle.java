package ss6.bai_tap.circle;

public class Circle {
    private double darius;
    private String color;

    public Circle() {
    }

    public Circle(double darius, String color) {
        this.darius = darius;
        this.color = color;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAreaCircle(){
        return Math.PI*Math.pow(darius,2);
    }


    public String toadd() {
        return  "darius=" + darius +
                ", color='" + color + '\'' ;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "darius=" + darius +
                ", color='" + color + "'"+
                ", AreaCircle= "+getAreaCircle() +
                '}';
    }
}
