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
        double sine = 0;
        for(int i=0; i < 50; i++)
        {
            sine = sine + vmath.algebra.pow(-1,i) * vmath.algebra.pow(angleRadian,2*i+1) / vmath.algebra.factorial(2*i+1);
        }
        return sine;
    }
    /**
     * Returns the sine of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The sine of the angle
     */
    public double sin(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double sine = sinRad(radian);
        return sine;
    }

    /**
     * Returns the cosine of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The cosine of the angle
     */
    public double cosRad(double angleRadian) {
        angleRadian = angleRadian % (2 * PI);
        if(angleRadian == PI/2 || angleRadian == 3*PI/2)
            return 0;

        double cosine = 1;
        for(int i=1; i<20; i++){
            double term = vmath.algebra.pow(-1,i) * vmath.algebra.pow(angleRadian,2*i) / vmath.algebra.factorial(2*i);
            cosine += term;
        }
        return cosine;
    }

    /**
     * Returns the cosine of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The cosine of the angle
     */
    public double cos(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double cosine = cosRad(radian);
        return cosine; // Round to one decimal place
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
     * @return The cotangent of the angle
     */
    public double cotRad(double angleRadian){
        double cotangent = 1 / tanRad(angleRadian);
        return cotangent;
    }

    /**
     * Returns the cotangent of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The cotangent of the angle
     */
    public double cot(double angleDegree){
        double radian = degreeToRadian(angleDegree);
        double cot = cotRad(radian);
        return cot;
    }
    /**
     * Returns the secant of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The secant of the angle
     */
    public double secRad(double angleRadian){
        double sec = 1 / cosRad(angleRadian);
        return sec;
    }
    /**
     * Returns the secant of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The secant of the angle
     */
    public double sec(double angleDegree){
        double radian = degreeToRadian(angleDegree);
        double sec = secRad(radian);
        return sec;
    }

    /**
     * Returns the cosecant of an angle given in radian.
     * @param angleRadian The angle in radian
     * @return The cosecant of the angle
     */
    public double cosecRad(double angleRadian){
        double cosec = 1 / sinRad(angleRadian);
        return cosec;
    }

    /**
     * Returns the cosecant of an angle given in degree.
     * @param angleDegree The angle in degree
     * @return The cosecant of the angle
     */
    public double cosec(double angleDegree){
        double radian = degreeToRadian(angleDegree);
        double cosec = cosecRad(radian);
        return cosec;
    }

}
