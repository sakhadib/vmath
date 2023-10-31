package mathvoyage;

import java.util.ArrayList;

public class vmath {

    public static class constant{
        public static final double PI = 3.14159265358979323846;
        public static final double E = 2.71828182845904523536;
        public static final double GOLDEN_RATIO = 1.61803398874989484820;
        public static final double EULER_MASCHERONI_CONSTANT = 0.57721566490153286060;
        public static final double ARCHIMEDES_CONSTANT = 3.14159265358979323846;
        public static final double CATALAN_CONSTANT = 0.91596559417721901505;
        public static final double FEIGENBAUM_ALPHA = 2.50290787509589282228;
        public static final double FEIGENBAUM_DELTA = 4.66920160910299067185;

        // Physical Constants
        public static final double SPEED_OF_LIGHT = 299792458; // meters per second
        public static final double PLANCK_CONSTANT = 6.62607015e-34; // Joule seconds
        public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // m^3/kg/s^2
        public static final double BOLTZMANN_CONSTANT = 1.380649e-23; // J/K
        public static final double AVOGADRO_NUMBER = 6.02214076e23; // mol⁻¹
        public static final double UNIVERSAL_GRAVITATIONAL_CONSTANT = 6.67430e-11; // N m²/kg²
        public static final double PLANCK_LENGTH = 1.616255e-35; // meters
        public static final double PLANCK_TIME = 5.39116e-44; // seconds
    }

    /**
     * Contains Basic Algebraic functions to find min, max, min and max index of an array, factorial, and more.
     * @author Adib Sakhawat
     */
    public static class algebra{
        /**
         * Returns the floor of a number.
         * @param number The number
         * @return The floor
         */
        public static double floor(double number){
            Algebra alg = Algebra.getInstance();
            return alg.floor(number);
        }
        /**
         * Returns the minimum of two comparable objects.
         * @param a The first object
         * @param b The second object
         * @return The minimum of the two objects
         */
        public static <T extends Comparable<T>> T min(T a, T b) {
            Algebra alg = Algebra.getInstance();
            return alg.min(a, b);
        }

        /**
         * Returns the minimum of an array of comparable objects.
         * @param array The array of objects
         * @return The minimum of the array
         */
        public static <T extends Comparable<T>> T min(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.min(array);
        }

        /**
         * Returns the maximum of two comparable objects.
         * @param a The first object
         * @param b The second object
         * @return The maximum of the two objects
         */
        public static <T extends Comparable<T>> T max(T a, T b) {
            Algebra alg = Algebra.getInstance();
            return alg.max(a, b);
        }

        /**
         * Returns the maximum of an array of comparable objects.
         * @param array The array of objects
         * @return The maximum of the array
         */
        public static <T extends Comparable<T>> T max(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.max(array);
        }

        /**
         * Returns the index of the maximum of an array of comparable objects.
         * @param array The array of objects
         * @return The index of the maximum of the array
         */
        public static <T extends Comparable<T>> int argMax(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.maxIndex(array);
        }

        /**
         * Returns the index of the minimum of an array of comparable objects.
         * @param array The array of objects
         * @return The index of the minimum of the array
         */
        public static <T extends Comparable<T>> int argMin(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.minIndex(array);
        }

        /**
         * Calculates the power of a number.
         * @param base The base
         * @param exponent The exponent
         * @return The result
         */
        public static <T extends Number> double pow(T base, int exponent) {
            Algebra alg = Algebra.getInstance();
            return alg.pow(base, exponent);
        }

        /**
         * Calculates the square root of a number.
         * @param number The number
         * @return The result
         */
        public static <T extends Number> double sqrt(T number) {
            Algebra alg = Algebra.getInstance();
            return alg.sqrt(number);
        }

        /**
         * Calculates the cube root of a number.
         * @param number The number
         * @return The result
         */
        public static <T extends Number> double cubeRoot(T number) {
            Algebra alg = Algebra.getInstance();
            return alg.cubeRoot(number);
        }

        /**
         * Finds the nth root of a number.
         * @param number the number which I have to find nth root
         * @param n the root
         * @return result
         */
        public static <T extends Number> double nthRoot(T number, int n){
            Algebra alg = Algebra.getInstance();
            return alg.nthRoot(number,n);
        }

        /**
         * Returns the Absolute value of a number.
         * @param number The number
         * @return The result
         */
        public static int abs(int number) {
            Algebra alg = Algebra.getInstance();
            return alg.abs(number);
        }

        /**
         * Returns the Absolute value of a number.
         * @param number The number
         * @return The result
         */
        public static double abs(double number) {
            Algebra alg = Algebra.getInstance();
            return alg.abs(number);
        }

        /**
         * Returns the factorial of a number.
         * @param number The number
         * @return The factorial
         */
        public static double factorial(int number){
            Factorial_UTIL fact = Factorial_UTIL.getInstance();
            return fact.factorial(number);
        }

        /**
         * Returns the greatest common divisor of two numbers.
         * @param a
         * @param b
         * @return The greatest common divisor
         */
        public static int gcd(int a, int b){
            Algebra alg = Algebra.getInstance();
            return alg.gcd(a, b);
        }

        /**
         * Returns the least common multiple of two numbers.
         * @param a
         * @param b
         * @return The least common multiple
         */
        public static int lcm(int a, int b){
            Algebra alg = Algebra.getInstance();
            return alg.lcm(a, b);
        }

    }

    /**
     * Contains functions to convert numbers from one base to another.
     * @author Adib Sakhawat
     */
    public static class baseConverter{
        /**
         * Converts a binery number (string) to decimal number (double).
         * @param bineryNumber The binery number in string format
         * @return The decimal number
         */
        public static double binToDec(String bineryNumber) {
            BaseConverter base = BaseConverter.getInstance();
            return base.binaryToDecimal(bineryNumber);
        }

        /**
         * Converts a decimal number (double) to binery number (string).
         * @param decimalNumber The decimal number
         * @return The binery number in string format
         */
        public static String decToBin(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToBinary(decimalNumber);
        }

        /**
         * Converts a decimal number (double) to Hexadecimal number (string).
         * @param decimalNumber The decimal number
         * @return The Hexadecimal number in string format
         */
        public static String decToHex(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToHexadecimal(decimalNumber);
        }

        /**
         * Converts a Hexadecimal number (string) to decimal number (double).
         * @param hexadecimalString The Hexadecimal number in string format
         * @return The decimal number
         */
        public static double hexToDec(String hexadecimalString){
            BaseConverter base = BaseConverter.getInstance();
            return base.hexadecimalToDecimal(hexadecimalString);
        }

        /**
         * Converts an Octal number (String) to a Decimal number (double).
         * @param octalString The decimal number
         * @return The Octal number in string format
         */
        public static double octToDec(String octalString){
            BaseConverter base = BaseConverter.getInstance();
            return base.octalToDecimal(octalString);
        }

        /**
         * Converts a decimal number (double) to Octal number (string).
         * @param decimalNumber The decimal number
         * @return The Octal number in string format
         */
        public static String decToOct(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToOctal(decimalNumber);
        }

        /**
         * Converts a decimal number (double) to a number of any base (string).
         * @param decimalNumber
         * @param base
         * @return The number in string format
         */
        public static String decToN(double decimalNumber, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.decimalToBaseN(decimalNumber, base);
        }

        /**
         * Converts a number of any base (string) to a decimal number (double).
         * @param number
         * @param base
         * @return The decimal number
         */
        public static double nToDec(String number, int base) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.baseNToDecimal(number, base);
        }

        /**
         * Converts a binary number (string) to an octal number (string).
         * @param binaryString
         * @return
         */
        public static String binToOct(String binaryString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToOctal(binaryString);
        }

        /**
         * Converts an octal number (string) to a binary number (string).
         * @param octalString
         * @return The binary number in string format
         */
        public static String octToBin(String octalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToBinary(octalString);
        }

        /**
         * Converts a binary number (string) to a hexadecimal number (string).
         * @param binaryString
         * @return The hexadecimal number in string format
         */
        public static String binToHex(String binaryString) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToHexadecimal(binaryString);
        }

        /**
         * Converts a hexadecimal number (string) to a binary number (string).
         * @param hexadecimalString
         * @return The binary number in string format
         */
        public static String hexToBin(String hexadecimalString) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToBinary(hexadecimalString);
        }

        /**
         * Converts a binary number (string) to a number of any base (string).
         * @param binaryString
         * @param base
         * @return The number in string format
         */
        public static String binToN(String binaryString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToBaseN(binaryString, base);
        }

        /**
         * Converts a number from octal to hexadecimal
         * @param octalString
         * @return The hexadecimal number in string format
         */
        public static String octToHex(String octalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToHexadecimal(octalString);
        }

        /**
         * Converts a number from hexadecimal to octal
         * @param hexadecimalString
         * @return The octal number in string format
         */
        public static String hexToOct(String hexadecimalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToOctal(hexadecimalString);
        }

        /**
         * Converts a number from octal to any base
         * @param octalString
         * @param base
         * @return The number in string format
         */
        public static String octToN(String octalString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToBaseN(octalString, base);
        }

        /**
         * Converts a number from hexadecimal to any base
         * @param hexadecimalString
         * @param base
         * @return The number in string format
         */
        public static String hexToN(String hexadecimalString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToBaseN(hexadecimalString, base);
        }

        /**
         * Converts a number from any base to any base
         * @param baseNString
         * @param baseN
         * @param baseK
         * @return The binary number in string format
         */
        public static String nToK(String baseNString, int baseN, int baseK){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.baseNToBaseK(baseNString, baseN, baseK);
        }


    }

    /**
     * Contains functions to calculate trigonometric relations and values for numbers in radian and degree.
     * @author Tahsin Islam
     */
    public static class Trigonometry{
        /**
         * Returns the conversion of degree to radian.
         * @param angleDegree The angle in degree
         * @return The angle in radian
         */
        public static double degreeToRadian(double angleDegree){
           trigonometry trig = trigonometry.getInstance();
           return trig.degreeToRadian(angleDegree);
       }

        /**
         * Returns the conversion of radian to degree.
         * @param angleRadian The angle in radian
         * @return The angle in degree
         */
        public static double radianToDegree(double angleRadian) {
            trigonometry trig = trigonometry.getInstance();
            return trig.radianToDegree(angleRadian);
        }

        /**
         * Returns the sine of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The sine of the angle
         */
        public static double sin(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if(unit == Angle.DEGREE) {
                return trig.sin(angle);
            } else {
                return trig.sinRad(angle);
            }
        }

        /**
         * Returns the cosine of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The cosine of the angle
         */
        public static double cos(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if(unit == Angle.DEGREE) {
                return trig.cos(angle);
            } else {
                return trig.cosRad(angle);
            }
        }

        /**
         * Returns the tangent of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The tangent of the angle
         */
        public static double tan(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.tan(angle);
            } else {
                return trig.tanRad(angle);
            }
        }

        /**
         * Returns the cotangent of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The cotangent of the angle
         */
        public static double cot(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.cot(angle);
            } else {
                return trig.cotRad(angle);
            }
        }

        /**
         * Returns the secant of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The secant of the angle
         */
        public static double sec(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.sec(angle);
            } else {
                return trig.secRad(angle);
            }
        }

        /**
         * Returns the cosecant of an angle given in radian.
         * @param angle The angle
         * @param unit The unit of the angle
         * @return The cosecant of the angle
         */
        public static double cosec(double angle, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.cosec(angle);
            } else {
                return trig.cosecRad(angle);
            }
        }

        /**
         * Returns the arc sine of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc sine of the number
         */
        public static double arcsin(double number, Angle unit){
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arcsin(number);
            } else {
                return trig.arcsinRad(number);
            }
        }

        /**
         * Returns the arc cosine of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc cosine of the number
         */
        public static double arccos(double number, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arccos(number);
            } else {
                return trig.arccosRad(number);
            }
        }

        /**
         * Returns the arc tangent of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc tangent of the number
         */
        public static double arctan(double number, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arctan(number);
            } else {
                return trig.arctanRad(number);
            }
        }

        /**
         * Returns the arc cotangent of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc cotangent of the number
         */
        public static double arccot(double number, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arccot(number);
            } else {
                return trig.arccotRad(number);
            }
        }

        /**
         * Returns the arc secant of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc secant of the number
         */
        public static double arcsec(double number, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arcsec(number);
            } else {
                return trig.arcsecRad(number);
            }
        }

        /**
         * Returns the arc cosecant of a number.
         * @param number The number
         * @param unit The unit of the angle to return
         * @return The arc cosecant of the number
         */
        public static double arccosec(double number, Angle unit) {
            trigonometry trig = trigonometry.getInstance();
            if (unit == Angle.DEGREE) {
                return trig.arccosec(number);
            } else {
                return trig.arccosecRad(number);
            }
        }
    }

    /**
     * Contains functions to calculate combination, permutations and vice versa of numbers and sets of numbers.
     * Also contains functions to generate subsets of a set of numbers.
     * @Author Takia Farhin
     */
    public static class combinatorics{
        /**
         * Calculates the combination value.
         * @param n
         * @param r
         * @return the combination value.
         */
        public static double combination(int n, int r){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.combination(n,r);
        }
        /**
         * Calculates the permutation value.
         * @param n
         * @param r
         * @return the permutation value.
         */
        public static double permutation(int n, int r){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.permutation(n,r);
        }

        /**
         * Returns the number of subsets of a set.
         * @param n The number of elements in the set
         * @return The number of subsets
         */
        public static double numberOfSubsets(int n){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.numberOfSubsets(n);
        }

        /**
         * Returns the number of subsets of a set. The set have to be an array of integers.
         * @param set The set
         * @return All the subsets possible
         */
        public static ArrayList<ArrayList<Integer>> generateSubsets(Integer[] set){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.generateSubsets(set);
        }
    }

    public static class matrix{
        public static Matrix add(Matrix a, Matrix b){
            return a.add(b);
        }

        public static Matrix subtract(Matrix a, Matrix b){
            return a.subtract(b);
        }

        public static Matrix multiply(Matrix a, Matrix b){
            return a.multiply(b);
        }

        public static Matrix transpose(Matrix a){
            return a.transpose();
        }

        public static Matrix inverse(Matrix a){
            return a.inverse();
        }

        public static double detarminant(Matrix a){
            return a.getDeterminant();
        }

        public static Matrix zeros(int rows, int cols) {
            double[][] data = new double[rows][cols];
            return new Matrix(data);
        }

        public Matrix ones(int rows, int cols) {
            double[][] data = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i][j] = 1;
                }
            }
            return new Matrix(data);
        }

        public static Matrix eye(int n) {
            double[][] data = new double[n][n];
            for (int i = 0; i < n; i++) {
                data[i][i] = 1;
            }
            return new Matrix(data);
        }

        public static boolean compare(Matrix a, Matrix b){
            return a.isEqual(b);
        }

        public static Matrix pow(Matrix a, int power){
            return a.pow(power);
        }

    }


}
