package mathvoyage.geometry;

import mathvoyage.trig.Angle;
import mathvoyage.vmath;

public class PolarPoint implements Point{
    double r;
    double theta;
    double x;
    double y;

    public PolarPoint(double r, double theta){
        this.r = r;
        this.theta = theta;
        this.x = getX();
        this.y = getY();
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
        return r * vmath.Trigonometry.cos(theta, Angle.DEGREE);
    }

    /**
     * Returns the y-coordinate of the point.
     * @return The y-coordinate of the point
     */
    public double getY(){
        return r * vmath.Trigonometry.sin(theta, Angle.DEGREE);
    }

}
