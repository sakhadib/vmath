package mathvoyage;

public interface Line {
    /**
     * Returns the slope of the line.
     * @return The slope of the line
     */
    double getSlope();

    /**
     * Returns the shift of the line.
     * @return The shift of the line
     */
    double getShift();

    /**
     * Returns the y-intercept of the line.
     * @return The y-intercept of the line
     */
    double getYIntercept();

    /**
     * Returns the x-intercept of the line.
     * @return The x-intercept of the line
     */
    double getXIntercept();

    /**
     * Returns the coefficient of x of the line.
     * @return The coefficient of x of the line
     */
    double getCoefficientOfX();

    /**
     * Returns the coefficient of y of the line.
     * @return The coefficient of y of the line
     */
    double getCoefficientOfY();

    /**
     * Returns the constant of the line.
     * @return The constant of the line
     */
    double getConstant();
}
