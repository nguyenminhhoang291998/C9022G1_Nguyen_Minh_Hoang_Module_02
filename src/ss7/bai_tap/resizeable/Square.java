package ss7.bai_tap.resizeable;

import ss7.bai_tap.colorable.Colorable;

public class Square extends Shape implements Colorable {
    private double width = 1.0;
    private boolean colorable;

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public Square() {
    }



    public Square( double width, String color, boolean filled, boolean colorable) {
        super(color, filled,colorable);
        this.width = width;
        this.colorable=colorable;

    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPerimeter() {
        return 2 * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {
        setWidth(getWidth()*percent/100 + getWidth());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
