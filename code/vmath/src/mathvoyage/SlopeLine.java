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
    public double getSlope() {
        return slope;
    }
    public double getShift() {
        return shift;
    }
    public double getXIntercept(){
        if(shift == 0){
            return -slope;
        }
        return -slope*shift;
    }
    public double getYIntercept(){
        if(shift == 0){
            return 1;
        }
        return shift;
    }
    public double getCoefficientOfX(){
        return slope;
    }
    public double getCoefficientOfY(){
        return -1;
    }
    public double getConstant(){
        return shift;
    }


}
