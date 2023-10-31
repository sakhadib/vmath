package mathvoyage.geometry;

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
