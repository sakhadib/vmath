package mathvoyage.geometry;

public interface Point {
    double getX();
    double getY();
    double getR();
    double getTheta();

    public static Point getPoint(double x, double y){
        return new CartesianPoint(x, y);
    }
}
