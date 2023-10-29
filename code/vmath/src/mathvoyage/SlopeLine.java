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
    /**
     * Returns the slope of the line.
     * @return The slope of the line
     */
    public double getSlope() {
        return slope;
    }

    /**
     * Returns the shift of the line.
     * @return The shift of the line
     */
    public double getShift() {
        return shift;
    }

    /**
     * Returns the x-intercept of the line.
     * @return The x-intercept of the line
     */
    public double getXIntercept() {
        if (shift == 0) {
            return 0;
        }
        return -shift * slope;
    }

    /**
     * Returns the y-intercept of the line.
     * @return The y-intercept of the line
     */
    public double getYIntercept(){
        if(shift == 0){
            return 0;
        }
        return shift;
    }

    /**
     * Returns the coefficient of x of the line.
     * @return The coefficient of x of the line
     */
    public double getCoefficientOfX(){
        return slope;
    }

    /**
     * Returns the coefficient of y of the line.
     * @return The coefficient of y of the line
     */
    public double getCoefficientOfY(){
        return -1;
    }

    /**
     * Returns the constant of the line.
     * @return The constant of the line
     */
    public double getConstant(){
        return shift;
    }


}
