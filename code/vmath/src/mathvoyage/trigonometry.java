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
    public double degreeToRadian(double angledegree){
        double radian = angledegree * PI / 180;
        return radian;
    }
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
    public double sin(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double result = sinRad(radian);
        return result;
    }

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

    public double cos(double angleDegree) {
        double radian = degreeToRadian(angleDegree);
        double result = cosRad(radian);
        return result; // Round to one decimal place
    }
}
