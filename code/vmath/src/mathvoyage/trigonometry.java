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

    public double degreeToRadian(double angleDegree){
        double radian = angleDegree * PI / 180;
        return radian;
    }

    public double radianToDegree(double angleRadian){
        double degree = angleRadian * 180 / PI;
        return degree;
    }

}
