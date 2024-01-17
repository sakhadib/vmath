package mathvoyage.geometry;

/**
 * The interface Point.
 */
public interface Point {
    /**
     * Gets x.
     *
     * @return the x
     */
    double getX();

    /**
     * Gets y.
     *
     * @return the y
     */
    double getY();

    /**
     * Gets r.
     *
     * @return the r
     */
    double getR();

    /**
     * Gets theta.
     *
     * @return the theta
     */
    double getTheta();

    /**
     * To cartesian point.
     *
     * @return the point
     */
    Point toCartesian();

    /**
     * To polar point.
     *
     * @return the point
     */
    Point toPolar();

}
