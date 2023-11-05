package mathvoyage.geometry;

import mathvoyage.Angle;
import mathvoyage.vmath;
import mathvoyage.*;

public class CartesianPoint implements Point{
    double x;
    double y;
    double r;
    double theta;

    public CartesianPoint(double x, double y){
        this.x = x;
        this.y = y;
        this.r = vmath.algebra.sqrt(x*x + y*y);
        this.theta = vmath.Trigonometry.arctan(y/x, Angle.DEGREE);
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
        return r;
    }

    /**
     * Returns the theta-coordinate of the point.
     * @return The theta-coordinate of the point
     */
    public double getTheta(){
        return theta;
    }

    public Point toPolar(){
        return new PolarPoint(r, theta);
    }

    public Point toCartesian(){
        return new CartesianPoint(x, y);
    }
}
