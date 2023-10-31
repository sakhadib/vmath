package mathvoyage.geometry;

import mathvoyage.trig.Angle;
import mathvoyage.vmath;

public class CartesianPoint implements Point{
    double x;
    double y;
    double r;
    double theta;

    public CartesianPoint(double x, double y){
        this.x = x;
        this.y = y;
        this.r = getR();
        this.theta = getTheta();
    }
    /**
     * Returns the x-coordinate of the point.
     * @return The x-coordinate of the point
     */
    public double getX(){
        return x;
    }

    /**
     * Returns the y-coordinate of the point.
     * @return The y-coordinate of the point
     */
    public double getY(){
        return y;
    }

    /**
     * Returns the r-coordinate of the point.
     * @return The r-coordinate of the point
     */
    public double getR(){
        return vmath.algebra.sqrt(x*x + y*y);
    }

    /**
     * Returns the theta-coordinate of the point.
     * @return The theta-coordinate of the point
     */
    public double getTheta(){
        return vmath.Trigonometry.arctan(y/x, Angle.DEGREE);
    }

}
