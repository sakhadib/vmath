package mathvoyage.geometry;

/**
 * The type Segment line.
 */
public class SegmentLine implements Line{
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
     * Instantiates a new Segment line.
     *
     * @param xIntercept the x intercept
     * @param yIntercept the y intercept
     */
    public SegmentLine(double xIntercept, double yIntercept){
        this.xIntercept = xIntercept;
        this.yIntercept = yIntercept;
        this.slope = getSlope();
        this.shift = getShift();
        this.coefficientOfX = getCoefficientOfX();
        this.coefficientOfY = getCoefficientOfY();
        this.constant = getConstant();
    }

    /**
     * Returns the x-intercept of the line.
     * @return The x-intercept of the line
     */
    public double getXIntercept() {
        return xIntercept;
    }
    /**
     * Returns the y-intercept of the line.
     * @return The y-intercept of the line
     */
    public double getYIntercept() {
        return yIntercept;
    }
    /**
     * Returns the slope of the line.
     * @return The slope of the line
     */
    public double getSlope() {
        return -yIntercept/xIntercept;
    }
    /**
     * Returns the shift of the line.
     * @return The shift of the line
     */
    public double getShift() {
        return yIntercept;
    }
    /**
     * Returns the coefficient of x of the line.
     * @return The coefficient of x of the line
     */
    public double getCoefficientOfX() {
        return yIntercept;
    }
    /**
     * Returns the coefficient of y of the line.
     * @return The coefficient of y of the line
     */
    public double getCoefficientOfY() {
        return xIntercept;
    }
    /**
     * Returns the constant of the line.
     * @return The constant of the line
     */
    public double getConstant() {
        return -(xIntercept*yIntercept);
    }

}
