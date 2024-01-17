package mathvoyage.geometry;

import mathvoyage.Angle;
import mathvoyage.vmath;

/**
 * The type Polar point.
 */
public class PolarPoint implements Point{
    /**
     * The R.
     */
    double r;
    /**
     * The Theta.
     */
    double theta;
    /**
     * The X.
     */
    double x;
    /**
     * The Y.
     */
    double y;

    /**
     * Instantiates a new Polar point.
     *
     * @param r     the r
     * @param theta the theta
     */
    public PolarPoint(double r, double theta){
        this.r = r;
        this.theta = theta;
        this.x = r * vmath.Trigonometry.cos(theta, Angle.DEGREE);
        this.y = r * vmath.Trigonometry.sin(theta, Angle.DEGREE);
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

    public Point toCartesian(){
        return new CartesianPoint(x, y);
    }

    public Point toPolar(){
        return new PolarPoint(r, theta);
    }

}
