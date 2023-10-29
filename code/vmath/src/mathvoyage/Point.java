package mathvoyage;

public interface Point {
    double getX();
    double getY();
    double getR();
    double getTheta();
    double distance(Point p, Point q);
}
