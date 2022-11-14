package ss7.bai_tap.resizeable;

import ss7.bai_tap.colorable.Colorable;

public class Shape implements Resizeable {
        private String color = "green";
        private boolean filled = true;
    private boolean colorable;

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public Shape() {
        }

        public double getArea(){
            return 1;
        };

        public Shape(String color, boolean filled, boolean colorable) {
            this.color = color;
            this.filled = filled;
            this.colorable=colorable;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A Shape with color of "
                    + getColor()
                    + " and "
                    + (isFilled() ? "filled" : "not filled");
        }

    @Override
    public void resize(double percent) {
    }



}
