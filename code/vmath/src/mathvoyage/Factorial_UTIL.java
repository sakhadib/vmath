package mathvoyage;

public class Factorial_UTIL {
    private double[] fact = new double[1001];
    private static Factorial_UTIL instance;

    // private constructor to prevent external instantiation
    private Factorial_UTIL() {
        fact[0] = 1;
        for (int i = 1; i < 1001; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Factorial_UTIL getInstance() {
        if (instance == null) {
            instance = new Factorial_UTIL();
        }
        return instance;
    }

    /**
     * Returns the factorial of a number.
     * @param number The number
     * @return The factorial
     */
    public double factorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial of negative number is undefined");
        }
        if (number > 1000) {
            throw new IllegalArgumentException("Factorial of number greater than 1000 is undefined");
        }
        try{
            return fact[(int) number];
        }
        catch(Exception e){
            throw new IllegalArgumentException("Factorial of number greater than 1000 is undefined");
        }

    }

}
