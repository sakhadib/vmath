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

    /**
     * Returns the area of a triangle.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return The area of the triangle
     */
    public double areaOfTriangle(Point p1, Point p2, Point p3){
        double m[][] = {{p1.getX(), p1.getY(), 1}, {p2.getX(), p2.getY(), 1}, {p3.getX(), p3.getY(), 1}};
        Matrix matrix = new Matrix(m);
        double area = 0.5 * matrix.getDeterminant();
        return area;
    }

    /**
     * Returns the interleaver point of two points that divides the connecting line in a ratio of m:n.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param m The ratio of the first point
     * @param n The ratio of the second point
     * @return The interleaver point of the two points
     */
    public Point interleaverPoint(Point p1, Point p2, double m, double n){
        double x = (m * p2.getX() + n * p1.getX()) / (m + n);
        double y = (m * p2.getY() + n * p1.getY()) / (m + n);
        Point interleaverPoint = new CartesianPoint(x, y);
        return interleaverPoint;
    }

    /**
     * Returns the externalizer point of two points that divides the connecting line in a ratio of m:n.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param m The ratio of the first point
     * @param n The ratio of the second point
     * @return The externalizer point of the two points
     */
    public Point externalizerPoint(Point p1, Point p2, double m, double n){
        double x = (m * p2.getX() - n * p1.getX()) / (m - n);
        double y = (m * p2.getY() - n * p1.getY()) / (m - n);
        Point externalizerPoint = new CartesianPoint(x, y);
        return externalizerPoint;
    }

    /**
     * Returns the area of a quadrilaterial.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return The area of the quadrilaterial
     */
    public double areaOfQuadrilaterial(Point p1, Point p2, Point p3, Point p4){
        double comp1 = p1.getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * p4.getY() + p4.getX() * p1.getY();
        double comp2 = p1.getY() * p2.getX() + p2.getY() * p3.getX() + p3.getY() * p4.getX() + p4.getY() * p1.getX();
        double area = 0.5 * vmath.algebra.abs(comp1 - comp2);
        return area;
    }

    /**
     * Returns the area of a circle.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The area of the circle
     */
    public double areaOfCircle(Point p1, Point p2){
        double radius = distanceCartesian(p1, p2);
        double area = vmath.constant.PI* vmath.algebra.pow(radius, 2);
        return area;
    }

    /**
     * Returns the circumference of a circle.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @return The circumference of the circle
     */
    public double circumferenceOfCircle(Point p1, Point p2){
        double radius = distanceCartesian(p1, p2);
        double circumference = 2 * vmath.constant.PI * radius;
        return circumference;
    }

    /**
     * Returns if the triangle is a equilateral triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a equilateral triangle, false otherwise
     */
    public boolean isEquilateralTriangle(Point p1, Point p2, Point p3){
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p1);
        if (side1 == side2 && side2 == side3){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the triangle is a isosceles triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a isosceles triangle, false otherwise
     */
    public boolean isIsoscelesTriangle(Point p1, Point p2, Point p3){
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p1);
        if (side1 == side2 || side2 == side3 || side3 == side1){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the triangle is a scalene triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a scalene triangle, false otherwise
     */
    public boolean isScaleneTriangle(Point p1, Point p2, Point p3) {
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p1);
        if (side1 != side2 && side2 != side3 && side3 != side1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns if the triangle is a right triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a right triangle, false otherwise
     */
    public boolean isRightTriangle(Point p1, Point p2, Point p3){
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p1);
        if (side1 == vmath.algebra.sqrt(vmath.algebra.pow(side2, 2) + vmath.algebra.pow(side3, 2)) || side2 == vmath.algebra.sqrt(vmath.algebra.pow(side1, 2) + vmath.algebra.pow(side3, 2)) || side3 == vmath.algebra.sqrt(vmath.algebra.pow(side1, 2) + vmath.algebra.pow(side2, 2))){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the triangle is a obtuse triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a obtuse triangle, false otherwise
     */
    public boolean isObtuseTriangle(Point p1, Point p2, Point p3){
        double ang1 = angleBetweenTwoSlopes(slope(p1, p2), slope(p2, p3));
        double ang2 = angleBetweenTwoSlopes(slope(p2, p3), slope(p3, p1));
        double ang3 = angleBetweenTwoSlopes(slope(p3, p1), slope(p1, p2));

        if(ang1 > 90 || ang2 > 90 || ang3 > 90){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the triangle is a acute triangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return True if the triangle is a acute triangle, false otherwise
     */
    public boolean isAcuteTriangle(Point p1, Point p2, Point p3) {
        double ang1 = angleBetweenTwoSlopes(slope(p1, p2), slope(p2, p3));
        double ang2 = angleBetweenTwoSlopes(slope(p2, p3), slope(p3, p1));
        double ang3 = angleBetweenTwoSlopes(slope(p3, p1), slope(p1, p2));

        if(ang1 != ang2 && ang2 != ang3 && ang3 != ang1){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the angle between two slopes.
     * @param m1 The first slope
     * @param m2 The second slope
     * @return The angle between the two slopes
     */
    public double angleBetweenTwoSlopes(double m1, double m2){
        double angle = vmath.Trigonometry.arctan(((m1-m2)/(1-m1*m2)), Angle.DEGREE);
        return angle;
    }
}
