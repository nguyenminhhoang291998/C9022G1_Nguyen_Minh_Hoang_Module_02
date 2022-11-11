package ss6.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
         return new float[]{this.getXSpeed(),this.getYSpeed()};
    }

    @Override
    public String toString() {
        return '"'+ "("+ super.getX() + "," + super.getY() +
                "),speed=(" +this.xSpeed +','+this.ySpeed+ ')' +'"';
    }

    public MovablePoint move(){
        this.setX( this.getX()+ getXSpeed());
        this.setY( this.getY()+ getYSpeed());
        return this;
    }

}
