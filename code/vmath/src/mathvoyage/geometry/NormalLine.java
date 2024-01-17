package mathvoyage.geometry;

/**
 * The type Normal line.
 */
public class NormalLine implements Line{
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
     * Instantiates a new Normal line.
     *
     * @param coefficientOfX the coefficient of x
     * @param coefficientOfY the coefficient of y
     * @param constant       the constant
     */
    public NormalLine(double coefficientOfX, double coefficientOfY, double constant){
        this.coefficientOfX = coefficientOfX;
        this.coefficientOfY = coefficientOfY;
        this.constant = constant;
        this.slope = getSlope();
        this.shift = getShift();
        this.yIntercept = getYIntercept();
        this.xIntercept = getXIntercept();
    }

    /**
     * Returns the coefficient of x of the line.
     * @return The coefficient of x of the line
     */
    public double getCoefficientOfX() {
        return coefficientOfX;
    }

    /**
     * Returns the coefficient of y of the line.
     * @return The coefficient of y of the line
     */
    public double getCoefficientOfY() {
        return coefficientOfY;
    }

    /**
     * Returns the constant of the line.
     * @return The constant of the line
     */
    public double getConstant() {
        return constant;
    }

    /**
     * Returns the slope of the line.
     * @return The slope of the line
     */
    public double getSlope() {
        return -coefficientOfX/coefficientOfY;
    }

    /**
     * Returns the shift of the line.
     * @return The shift of the line
     */
    public double getShift() {
        return -constant/coefficientOfY;
    }

    /**
     * Returns the y-intercept of the line.
     * @return The y-intercept of the line
     */
    public double getYIntercept() {
        return constant/coefficientOfY;
    }

    /**
     * Returns the x-intercept of the line.
     * @return The x-intercept of the line
     */
    public double getXIntercept() {
        return constant/coefficientOfX;
    }

}
