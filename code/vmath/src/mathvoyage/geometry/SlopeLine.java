package mathvoyage.geometry;

/**
 * The type Slope line.
 */
public class SlopeLine implements Line{
    /**
     * The Slope.
     */
    public double slope;
    /**
     * The Shift.
     */
    public double shift;
    /**
     * The Y intercept.
     */
    public double yIntercept;
    /**
     * The X intercept.
     */
    public double xIntercept;
    /**
     * The Coefficient of x.
     */
    public double coefficientOfX;
    /**
     * The Coefficient of y.
     */
    public double coefficientOfY;
    /**
     * The Constant.
     */
    public double constant;


    /**
     * Instantiates a new Slope line.
     *
     * @param slope the slope
     * @param shift the shift
     */
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
