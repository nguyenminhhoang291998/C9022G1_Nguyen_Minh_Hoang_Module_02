package ss6.bai_tap.circle;

public class Cylinder extends Circle{
    private double hight;

    public Cylinder(double darius, String color, double hight) {
        super(darius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }
    public double getVolumeCylinder() {
        return hight*getAreaCircle();
    }

    @Override
    public String toString() {
        return    "Cylinder{" +
                 super.toadd() + ", "+
                "hight=" + hight +

                ", VolumeCylinder= " + getVolumeCylinder() +
                '}';
    }




}
