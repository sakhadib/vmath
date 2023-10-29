package mathvoyage;

public class SlopeLine implements Line{
    public double slope;
    public double shift;
    public double yIntercept;
    public double xIntercept;
    public double coefficientOfX;
    public double coefficientOfY;
    public double constant;


    public SlopeLine(double slope, double shift){
        this.slope = slope;
        this.shift = shift;
        this.yIntercept = getYIntercept();
        this.xIntercept = getXIntercept();
        this.coefficientOfX = getCoefficientOfX();
        this.coefficientOfY = getCoefficientOfY();
        this.constant = getConstant();
    }
}
