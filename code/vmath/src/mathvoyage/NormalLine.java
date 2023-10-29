package mathvoyage;

public class NormalLine implements Line{
    public double slope;
    public double shift;
    public double yIntercept;
    public double xIntercept;
    public double coefficientOfX;
    public double coefficientOfY;
    public double constant;

    public NormalLine(double coefficientOfX, double coefficientOfY, double constant){
        this.coefficientOfX = coefficientOfX;
        this.coefficientOfY = coefficientOfY;
        this.constant = constant;
        this.slope = getSlope();
        this.shift = getShift();
        this.yIntercept = getYIntercept();
        this.xIntercept = getXIntercept();
    }
    public double getCoefficientOfX() {
        return coefficientOfX;
    }
    public double getCoefficientOfY() {
        return coefficientOfY;
    }
    public double getConstant() {
        return constant;
    }
    public double getSlope() {
        return -coefficientOfX/coefficientOfY;
    }
    public double getShift() {
        return -constant/coefficientOfY;
    }
    public double getYIntercept() {
        return constant/coefficientOfY;
    }
    public double getXIntercept() {
        return constant/coefficientOfX;
    }

}
