package mathvoyage;
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
//
//    /**
//     * Returns the distance between two points.
//     * @param p1 The first point
//     * @param p2 The second point
//     * @return The distance between the two points
//     */
//    public double distanceBetweenTwoPoints(Point p1, Point p2){
//        double distance = vmath.algebra.sqrt(vmath.algebra.pow(p1.x-p2.x,2)+vmath.algebra.pow(p1.y-p2.y,2));
//        return distance;
//    }
//
//    /**
//     * Returns the manhattan distance between two points.
//     * @param p1 The first point
//     * @param p2 The second point
//     * @return The manhattan distance between the two points
//     */
//    public double manhattanDistanceBetweenTwoPoints(Point p1, Point p2){
//        double distance = vmath.algebra.abs(p1.x-p2.x) + vmath.algebra.abs(p1.y-p2.y);
//        return distance;
//    }


}
