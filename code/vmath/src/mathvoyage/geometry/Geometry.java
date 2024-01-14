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
        double tot = compx + compy;
        double distance = vmath.algebra.sqrt(tot);
//        double distance = Math.sqrt(tot);
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
     * Returns the area of a triangle inputted in anti-clockwise order.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @return The area of the triangle
     */
    public double areaOfTriangle(Point p1, Point p2, Point p3){
        double m[][] = {{p1.getX(), p1.getY(), 1}, {p2.getX(), p2.getY(), 1}, {p3.getX(), p3.getY(), 1}};
        Matrix matrix = new Matrix(m);
        double area = 0.5 * matrix.getDeterminant();
        return vmath.algebra.abs(area);
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
     * Returns the ent
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
     * Returns the area of a quadrilateral using points inputted in anti-clockwise order.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return The area of the quadrilateral
     */
    public double areaOfQuadrilateral(Point p1, Point p2, Point p3, Point p4){
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

    /**
     * Returns if the quadrilateral is a rectangle or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return True if the quadrilateral is a rectangle, false otherwise
     */
    public boolean isRectangle(Point p1, Point p2, Point p3, Point p4){
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p4);
        double side4 = distanceCartesian(p4, p1);
        double dig1 = distanceCartesian(p1, p3);
        double dig2 = distanceCartesian(p2, p4);

        if(side1 == side3 && side2 == side4 && side1 != side2 && dig1 == dig2){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the quadrilateral is a square or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return True if the quadrilateral is a square, false otherwise
     */
    public boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p4);
        double side4 = distanceCartesian(p4, p1);
        double dig1 = distanceCartesian(p1, p3);
        double dig2 = distanceCartesian(p2, p4);

        if(side1 == side3 && side2 == side4 && side1 == side2 && dig1 == dig2){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the quadrilateral is a parallelogram or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return True if the quadrilateral is a parallelogram, false otherwise
     */
    public boolean isParallelogram(Point p1, Point p2, Point p3, Point p4) {
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p4);
        double side4 = distanceCartesian(p4, p1);
        double dig1 = distanceCartesian(p1, p3);
        double dig2 = distanceCartesian(p2, p4);

        if(side1 == side3 && side2 == side4 && side1 != side2 && dig1 != dig2){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the quadrilateral is a rhombus or not.
     * @param p1 The first point in cartesian coordinates
     * @param p2 The second point in cartesian coordinates
     * @param p3 The third point in cartesian coordinates
     * @param p4 The fourth point in cartesian coordinates
     * @return True if the quadrilateral is a rhombus, false otherwise
     */
    public boolean isRhombus(Point p1, Point p2, Point p3, Point p4) {
        double side1 = distanceCartesian(p1, p2);
        double side2 = distanceCartesian(p2, p3);
        double side3 = distanceCartesian(p3, p4);
        double side4 = distanceCartesian(p4, p1);
        double dig1 = distanceCartesian(p1, p3);
        double dig2 = distanceCartesian(p2, p4);

        if(side1 == side3 && side2 == side4 && side1 == side2 && dig1 != dig2){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns if the two given lines are same or not
     * @param l1 The first line
     * @param l2 The second line
     * @return True if the two given lines are same, false otherwise
     */
    public boolean isSameLine(Line l1, Line l2){
        double xRatio = l1.getCoefficientOfX() / l2.getCoefficientOfX();
        double yRatio = l1.getCoefficientOfY() / l2.getCoefficientOfY();
        double constantRatio = l1.getConstant() / l2.getConstant();

        if(xRatio == yRatio && yRatio == constantRatio){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the area of a triangle given three lines.
     * @param l1 The first line
     * @param l2 The second line
     * @param l3 The third line
     * @return The area of the triangle
     */
    public double areaOfTriangleGivenLine(Line l1, Line l2, Line l3){
        Point p1 = intersectionPoint(l1, l2);
        Point p2 = intersectionPoint(l2, l3);
        Point p3 = intersectionPoint(l3, l1);
        double m[][] = {{p1.getX(), p1.getY(), 1}, {p2.getX(), p2.getY(), 1}, {p3.getX(), p3.getY(), 1}};
        Matrix matrix = new Matrix(m);
        double area = 0.5* matrix.getDeterminant();
        return vmath.algebra.abs(area);
    }
    /**
     * Returns if the given three lines are same or not
     * @param l1 The first line
     * @param l2 The second line
     * @param l3 The third line
     * @return True if the given three lines are same, false otherwise
     */
    public boolean isThreeLinesSame(Line l1, Line l2, Line l3){
        double area = areaOfTriangleGivenLine(l1, l2, l3);
        if(area == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the intersection point of two lines.
     * @param l1 The first line
     * @param l2 The second line
     * @return The intersection point of the two lines
     */
    public Point intersectionPoint(Line l1, Line l2){
        double x = (l1.getCoefficientOfY()*l2.getConstant() - l2.getCoefficientOfY()*l1.getConstant()) / (l1.getCoefficientOfX()*l2.getCoefficientOfY() - l2.getCoefficientOfX()*l1.getCoefficientOfY());
        double y = (l1.getConstant()*l2.getCoefficientOfX() - l2.getConstant()*l1.getCoefficientOfX()) / (l1.getCoefficientOfX()*l2.getCoefficientOfY() - l2.getCoefficientOfX()*l1.getCoefficientOfY());
        Point p = new CartesianPoint(x, y);
        return p;
    }

    /**
     * Returns if the two given lines are parallel or not
     * @param l1 The first line
     * @param l2 The second line
     * @return True if the two given lines are parallel, false otherwise
     */
    public boolean isParallel(Line l1, Line l2){
        return l1.getSlope() == l2.getSlope();
    }

    /**
     * Returns if the two given lines are perpendicular or not
     * @param l1 The first line
     * @param l2 The second line
     * @return True if the two given lines are perpendicular, false otherwise
     */
    public boolean isPerpendicular(Line l1, Line l2){
        return l1.getSlope() * l2.getSlope() == -1;
    }

    /**
     * Returns the slope of a line.
     * @param l The line
     * @return The slope of the line
     */
    public double slopeOfLine(Line l){
        return l.getSlope();
    }

    /**
     * Returns the distance between two parallel lines.
     * @param l1 The first line
     * @param l2 The second line
     * @return The distance between the two parallel lines
     */
    public double distanceBetweenTwoParallelLines(Line l1, Line l2){
        double distance = vmath.algebra.abs((l1.getConstant()-l2.getConstant())/vmath.algebra.sqrt(vmath.algebra.pow(l1.getCoefficientOfX(), 2) + vmath.algebra.pow(l1.getCoefficientOfY(), 2)));
        return distance;
    }

    /**
     * Returns the perpendicular distance of a line form a point.
     * @param l The line
     * @param p The point
     * @return The perpendicular distance of the line form the point
     */
    public double perpendicularDistanceFromAPoint(Line l, Point p){
        double distance = vmath.algebra.abs(l.getCoefficientOfX()*p.getX() + l.getCoefficientOfY()*p.getY() + l.getConstant()) / vmath.algebra.sqrt(vmath.algebra.pow(l.getCoefficientOfX(), 2) + vmath.algebra.pow(l.getCoefficientOfY(), 2));
        return distance;
    }

    /**
     * Returns the perpendicular line of a line passing through a point.
     * @param l The line
     * @param p The point
     * @return The perpendicular line of the line passing through the point
     */
    public Line getPerpendicularLine(Line l, Point p){
        double k = l.getCoefficientOfX() * p.getY() - l.getCoefficientOfY() * p.getX();
        System.out.println(k);
        Line pl = new NormalLine(l.getCoefficientOfY(), -1*l.getCoefficientOfX(), k);
        return pl;
    }

    /**
     * Returns the parallel line of a line passing through a point.
     * @param l The line
     * @param p The point
     * @return The parallel line of the line passing through the point
     */
    public Line getParallelLine(Line l, Point p){
        double k = -1 * (p.getX()*l.getCoefficientOfX() + p.getY()*l.getCoefficientOfY());
        Line pl = new NormalLine(l.getCoefficientOfX(), l.getCoefficientOfY(), k);
        return pl;
    }

    /**
     * Returns the line passing through the intersection point of two lines.
     * @param l1 The first line
     * @param l2 The second line
     * @return The line passing through the intersection point of the two lines
     */
    public Line getLineFromIntersectingPoint(Line l1, Line l2, Point p){
        Point p1 = intersectionPoint(l1, l2);
        Line l = getLineFromTwoPoints(p, p1);
        return l;
    }

    /**
     * Returns the area of a quadrilateral using four lines inputted in anticlockwise order.
     * @param l1 The first line
     * @param l2 The second line
     * @param l3 The third line
     * @param l4 The fourth line
     * @return The area of the quadrilateral
     */
    public double areaOfQuadrilateralUsingLine(Line l1, Line l2, Line l3, Line l4){
        Point p1 = intersectionPoint(l1, l2);
        Point p2 = intersectionPoint(l2, l3);
        Point p3 = intersectionPoint(l3, l4);
        Point p4 = intersectionPoint(l4, l1);
        double area = areaOfQuadrilateral(p1, p2, p3, p4);
        return area;
    }

    /**
     * Returns the area of a convex polygon using points inputted in anticlockwise order.
     * @param points The points of the convex polygon
     * @return The area of the convex polygon
     */
    public double areaOfConvexPolygon(Point[] points){
        double area = 0;
        for(int i = 0; i < points.length - 1; i++){
            area += points[i].getX() * points[i+1].getY() - points[i+1].getX() * points[i].getY();
        }
        area += points[points.length - 1].getX() * points[0].getY() - points[0].getX() * points[points.length - 1].getY();
        area = vmath.algebra.abs(area) / 2;
        return area;
    }

    /**
     * Returns if the point is inside the polygon or not.
     * @param points The points of the polygon
     * @param p The point
     * @return True if the point is inside the polygon, false otherwise
     */
    public boolean isPointInPolygon(Point[] points, Point p){
        double areaOfPolygon = areaOfConvexPolygon(points);
        double areaOfTriangle = 0;
        for(int i = 0; i < points.length - 1; i++){
            areaOfTriangle += areaOfTriangle(points[i], points[i+1], p);
        }
        areaOfTriangle += areaOfTriangle(points[points.length - 1], points[0], p);
        if(areaOfTriangle == areaOfPolygon){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the line passing through two points.
     * @param p1 The first point
     * @param p2 The second point
     * @return The line passing through the two points
     */
    public Line getLineFromTwoPoints(Point p1, Point p2){
        double a = p2.getY() - p1.getY();
        double b = p1.getX() - p2.getX();
        double c = p1.getY() * (p2.getX() - p1.getX()) - p1.getX() * (p2.getY() - p1.getY());
        Line l = new NormalLine(a, b, c);
        return l;
    }
    
}
