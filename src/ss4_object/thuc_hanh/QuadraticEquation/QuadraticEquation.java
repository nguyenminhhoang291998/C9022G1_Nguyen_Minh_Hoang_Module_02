package ss4_object.thuc_hanh.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (Math.pow(b,2) - 4*a*c);
    }
    public double getRoot1(){
        return ((-b + Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
        return ((-b - Math.sqrt(getDiscriminant()))/(2*a));
    }

}
