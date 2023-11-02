package mathvoyage.geometry;

import mathvoyage.Angle;
import mathvoyage.vmath;

/**
 * voyager.geometry.java
 * @author Tahsin Islam
 */
public class Geometry {
    private static Geometry instance;
    private Geometry() {
        // Private constructor to prevent external instantiation
    }
    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Geometry getInstance() {
        if (instance == null) {
            instance = new Geometry();
        }
        return instance;
    }

    /**
     * Returns the distance between two points in cartesian coordinates.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The distance between the two points in cartesian coordinates
     */
    public double distanceCartesian(Point p1, Point p2){
        double distance = vmath.algebra.sqrt(vmath.algebra.sqrt(vmath.algebra.pow(p2.getX() - p1.getX(), 2) + vmath.algebra.pow(p2.getY() - p1.getY(), 2)));
        return distance;
    }

    /**
     * Returns the distance between two points in polar coordinates.
     * @param p1 The first point in polar coordinates
     * @param p2 The second point in polar coordinates
     * @return The distance between the two points in polar coordinates
     */
    public double distancePolar(Point p1, Point p2){
        double distance = vmath.algebra.sqrt(vmath.algebra.pow(p2.getR(), 2) + vmath.algebra.pow(p1.getR(), 2) - 2 * p1.getR() * p2.getR() * vmath.Trigonometry.cos(p2.getTheta() - p1.getTheta(), Angle.DEGREE));
        return distance;
    }

    /**
     * Returns the manhattan distance between two points in cartesian coordinates.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The manhattan distance between the two points in cartesian coordinates
     */
    public double manhattanDistance(Point p1, Point p2){
        double distance = vmath.algebra.abs(p2.getX() - p1.getX()) + vmath.algebra.abs(p2.getY() - p1.getY());
        return distance;
    }

    /**
     * Returns the chebyshev distance between two points.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The chebyshev distance between the two points
     */
    public double chebyshevDistance(Point p1, Point p2){
        double distance = vmath.algebra.max(vmath.algebra.abs(p2.getX() - p1.getX()), vmath.algebra.abs(p2.getY() - p1.getY()));
        return distance;
    }


}
