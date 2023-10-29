package mathvoyage;

public class CartesianPoint implements Point{
    double x;
    double y;
    double r;
    double theta;

    public CartesianPoint(double x, double y){
        this.x = x;
        this.y = y;
        this.r = getR();
        this.theta = getTheta();
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getR(){
        return vmath.algebra.sqrt(x*x + y*y);
    }
    public double getTheta(){
        return vmath.Trigonometry.arctan(y/x, Angle.DEGREE);
    }
}
