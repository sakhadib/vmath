package mathvoyage;

public class SegmentLine implements Line{
    public double slope;
    public double shift;
    public double yIntercept;
    public double xIntercept;
    public double coefficientOfX;
    public double coefficientOfY;
    public double constant;


    public SegmentLine(double xIntercept, double yIntercept){
        this.xIntercept = xIntercept;
        this.yIntercept = yIntercept;
        this.slope = getSlope();
        this.shift = getShift();
        this.coefficientOfX = getCoefficientOfX();
        this.coefficientOfY = getCoefficientOfY();
        this.constant = getConstant();
    }
    public double getXIntercept() {
        return xIntercept;
    }
    public double getYIntercept() {
        return yIntercept;
    }
    public double getSlope() {
        return -yIntercept/xIntercept;
    }
    public double getShift() {
        return yIntercept;
    }
    public double getCoefficientOfX() {
        return yIntercept;
    }
    public double getCoefficientOfY() {
        return xIntercept;
    }
    public double getConstant() {
        return -(xIntercept*yIntercept);
    }

}
