package mathvoyage.geometry;

import mathvoyage.Angle;
import mathvoyage.matrix.Matrix;
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
        double compx = vmath.algebra.pow(p2.getX() - p1.getX(), 2);
        double compy = vmath.algebra.pow(p2.getY() - p1.getY(), 2);
        double distance = vmath.algebra.sqrt(compx + compy);
        //double distance = vmath.algebra.sqrt((vmath.algebra.pow(p2.getX() - p1.getX(), 2) + (vmath.algebra.pow(p2.getY() - p1.getY(), 2))));
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

    /**
     * Returns the slope of a line between two points.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The slope of the line between the two points
     */
    public double slope(Point p1, Point p2){
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }

    /**
     * Returns the midpoint of a line between two points.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The midpoint of the line between the two points
     */
    public Point midpoint(Point p1, Point p2) {
        double x = (p1.getX() + p2.getX()) / 2;
        double y = (p1.getY() + p2.getY()) / 2;
        Point midpoint = new CartesianPoint(x, y);
        return midpoint;
    }

    /**
     * Returns the centroid of a triangle.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return The centroid of the triangle
     */
    public Point centroid(Point p1, Point p2, Point p3){
        double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
        double y = (p1.getY() + p2.getY() + p3.getY()) / 3;
        Point centroid = new CartesianPoint(x, y);
        return centroid;
    }

    public double areaOfTriangle(Point p1, Point p2, Point p3){
        double m[][] = {{p1.getX(), p1.getY(), 1}, {p2.getX(), p2.getY(), 1}, {p3.getX(), p3.getY(), 1}};
        Matrix matrix = new Matrix(m);
        double area = 0.5 * matrix.getDeterminant();
        return area;
    }

}
