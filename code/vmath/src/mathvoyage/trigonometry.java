package mathvoyage;
/**
    * voyager.trigonometry.java
    * @author Tahsin Islam
 */
public class trigonometry {
    private static trigonometry instance;

    private trigonometry() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static trigonometry getInstance() {
        if (instance == null) {
            instance = new trigonometry();
        }
        return instance;
    }

    private static final double PI = 3.141592653589793;

    public double customRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**
     * Returns the conversion of degree to radian.
     * @param angleDegree The angle in degree
     * @return The angle in radian
     */
    public double degreeToRadian(double angleDegree){
        double radian = angleDegree * PI / 180;
        return radian;
    }

    /**
     * Returns the conversion of radian to degree.
     * @param angleRadian The angle in radian
     * @return
     */
    public static double radianToDegree(double angleRadian){
        double degree = angleRadian * 180 / PI;
        return degree;
    }

    /**
     * Returns the sine of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The sine of the angle
     */
    public double sinRad(double angleRadian){
        angleRadian = angleRadian % (2 * PI); // normalize the angle
        double term = 1.0; // ith term
        double sum  = 0.0; // sum of terms

        for (int i = 1; term != 0.0; i++) {
            term *= (angleRadian / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }

        return sum;
    }
    /**
     * Returns the sine of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The sine of the angle
     */
    public double sin(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double result = sinRad(radian);
        return result;
    }

    /**
     * Returns the cosine of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The cosine of the angle
     */
    public double cosRad(double angleRadian) {
        angleRadian = angleRadian % (2 * PI);
        double term = 1.0;
        double sum = 1.0;

        for (int i = 2; term != 0.0; i += 2) {
            term *= (angleRadian * angleRadian) / ((i - 1) * i);
            if (i % 4 == 2) sum -= term;
            if (i % 4 == 0) sum += term;
        }

        return sum;
    }

    /**
     * Returns the cosine of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The cosine of the angle
     */
    public double cos(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double result = cosRad(radian);
        return result; // Round to one decimal place
    }

    /**
     * Returns the tangent of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The tangent of the angle
     */
    public double tanRad(double angleRadian){
        double sin = sinRad(angleRadian);
        double cos = cosRad(angleRadian);
        double tan = sin / cos;
        return tan;
    }

    /**
     * Returns the tangent of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The tangent of the angle
     */
    public double tan(double angleDegree){
        double radian = degreeToRadian(angleDegree);
        double tan = tanRad(radian);
        return tan;
    }

    /**
     * Returns the cotangent of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return
     */
    public double cotRad(double angleRadian){
        double cotangent = 1 / tanRad(angleRadian);
        return cotangent;
    }

    /**
     * Returns the cotangent of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return
     */
    public double cot(double angleDegree){
        double radian = degreeToRadian(angleDegree);
        double result = cotRad(radian);
        return result;
    }
}
