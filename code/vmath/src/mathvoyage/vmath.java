package mathvoyage;

import mathvoyage.NumberSystem.BaseConverter;
import mathvoyage.algebra.Algebra;
import mathvoyage.algebra.Factorial_UTIL;
import mathvoyage.bitwise.Bitwise;
import mathvoyage.combinatorics.Combinatorics;
import mathvoyage.matrix.Matrix;
import mathvoyage.matrix.vector;
import mathvoyage.trig.trigonometry;
import mathvoyage.geometry.*;

import java.util.ArrayList;

/**
 * The type Vmath.
 */
public class vmath {

    /**
     * The type Constant.
     */
    public static class constant {
        /**
         * The constant PI.
         */
// Mathematical Constants
        public static final double PI = 3.14159265358979323846;
        /**
         * The constant E.
         */
        public static final double E = 2.71828182845904523536;
        /**
         * The constant GOLDEN_RATIO.
         */
        public static final double GOLDEN_RATIO = 1.61803398874989484820;
        /**
         * The constant EULER_MASCHERONI_CONSTANT.
         */
        public static final double EULER_MASCHERONI_CONSTANT = 0.57721566490153286060;
        /**
         * The constant ARCHIMEDES_CONSTANT.
         */
        public static final double ARCHIMEDES_CONSTANT = 3.14159265358979323846;
        /**
         * The constant CATALAN_CONSTANT.
         */
        public static final double CATALAN_CONSTANT = 0.91596559417721901505;
        /**
         * The constant FEIGENBAUM_ALPHA.
         */
        public static final double FEIGENBAUM_ALPHA = 2.50290787509589282228;
        /**
         * The constant FEIGENBAUM_DELTA.
         */
        public static final double FEIGENBAUM_DELTA = 4.66920160910299067185;

        /**
         * The constant SPEED_OF_LIGHT.
         */
// Physical Constants
        public static final double SPEED_OF_LIGHT = 299792458; // meters per second
        /**
         * The constant PLANCK_CONSTANT.
         */
        public static final double PLANCK_CONSTANT = 6.62607015e-34; // Joule seconds
        /**
         * The constant GRAVITATIONAL_CONSTANT.
         */
        public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // m^3/kg/s^2
        /**
         * The constant BOLTZMANN_CONSTANT.
         */
        public static final double BOLTZMANN_CONSTANT = 1.380649e-23; // J/K
        /**
         * The constant AVOGADRO_NUMBER.
         */
        public static final double AVOGADRO_NUMBER = 6.02214076e23; // mol⁻¹
        /**
         * The constant UNIVERSAL_GRAVITATIONAL_CONSTANT.
         */
        public static final double UNIVERSAL_GRAVITATIONAL_CONSTANT = 6.67430e-11; // N m²/kg²
        /**
         * The constant PLANCK_LENGTH.
         */
        public static final double PLANCK_LENGTH = 1.616255e-35; // meters
        /**
         * The constant PLANCK_TIME.
         */
        public static final double PLANCK_TIME = 5.39116e-44; // seconds

        /**
         * The constant SQUARE_ROOT_2.
         */
// Additional Mathematical Constants
        public static final double SQUARE_ROOT_2 = 1.41421356237309504880;
        /**
         * The constant SQUARE_ROOT_3.
         */
        public static final double SQUARE_ROOT_3 = 1.73205080756887729352;
        /**
         * The constant SQUARE_ROOT_5.
         */
        public static final double SQUARE_ROOT_5 = 2.23606797749978969640;
        /**
         * The constant SQUARE_ROOT_7.
         */
        public static final double SQUARE_ROOT_7 = 2.64575131106459059050;
        /**
         * The constant PHI.
         */
        public static final double PHI = (1 + SQUARE_ROOT_5) / 2; // The golden ratio

        /**
         * The constant PLANCK_MASS.
         */
// Constants related to Planck Units
        public static final double PLANCK_MASS = 2.17647e-8; // kg
        /**
         * The constant PLANCK_CHARGE.
         */
        public static final double PLANCK_CHARGE = 1.87555e-18; // C
        /**
         * The constant PLANCK_TEMPERATURE.
         */
        public static final double PLANCK_TEMPERATURE = 1.416808e32; // K

        /**
         * The constant ELECTRON_MASS.
         */
// Atomic Constants
        public static final double ELECTRON_MASS = 9.10938356e-31; // kg
        /**
         * The constant PROTON_MASS.
         */
        public static final double PROTON_MASS = 1.6726219e-27; // kg
        /**
         * The constant NEUTRON_MASS.
         */
        public static final double NEUTRON_MASS = 1.674927471e-27; // kg
        /**
         * The constant ELECTRON_CHARGE.
         */
        public static final double ELECTRON_CHARGE = 1.60217662e-19; // C

        /**
         * The constant LIGHT_YEAR.
         */
// Astronomical Constants
        public static final double LIGHT_YEAR = 9.461e15; // meters
        /**
         * The constant PARSEC.
         */
        public static final double PARSEC = 3.086e16; // meters
        /**
         * The constant SOLAR_MASS.
         */
        public static final double SOLAR_MASS = 1.989e30; // kg
        /**
         * The constant EARTH_RADIUS.
         */
        public static final double EARTH_RADIUS = 6371000; // meters
        /**
         * The constant MOON_RADIUS.
         */
        public static final double MOON_RADIUS = 1737100; // meters
        /**
         * The constant ASTRONOMICAL_UNIT.
         */
        public static final double ASTRONOMICAL_UNIT = 1.496e11; // meters
    }


    /**
     * Contains Basic Algebraic functions to find min, max, min and max index of an array, factorial, and more.
     *
     * @author Adib Sakhawat
     */
    public static class algebra{
        /**
         * Returns the floor of a number.
         *
         * @param number The number
         * @return The floor
         */
        public static double floor(double number){
            Algebra alg = Algebra.getInstance();
            return alg.floor(number);
        }

        /**
         * Returns the minimum of two comparable objects.
         *
         * @param <T> the type parameter
         * @param a   The first object
         * @param b   The second object
         * @return The minimum of the two objects
         */
        public static <T extends Comparable<T>> T min(T a, T b) {
            Algebra alg = Algebra.getInstance();
            return alg.min(a, b);
        }

        /**
         * Returns the minimum of an array of comparable objects.
         *
         * @param <T>   the type parameter
         * @param array The array of objects
         * @return The minimum of the array
         */
        public static <T extends Comparable<T>> T min(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.min(array);
        }

        /**
         * Returns the maximum of two comparable objects.
         *
         * @param <T> the type parameter
         * @param a   The first object
         * @param b   The second object
         * @return The maximum of the two objects
         */
        public static <T extends Comparable<T>> T max(T a, T b) {
            Algebra alg = Algebra.getInstance();
            return alg.max(a, b);
        }

        /**
         * Returns the maximum of an array of comparable objects.
         *
         * @param <T>   the type parameter
         * @param array The array of objects
         * @return The maximum of the array
         */
        public static <T extends Comparable<T>> T max(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.max(array);
        }

        /**
         * Returns the index of the maximum of an array of comparable objects.
         *
         * @param <T>   the type parameter
         * @param array The array of objects
         * @return The index of the maximum of the array
         */
        public static <T extends Comparable<T>> int argMax(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.maxIndex(array);
        }

        /**
         * Returns the index of the minimum of an array of comparable objects.
         *
         * @param <T>   the type parameter
         * @param array The array of objects
         * @return The index of the minimum of the array
         */
        public static <T extends Comparable<T>> int argMin(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.minIndex(array);
        }

        /**
         * Calculates the power of a number.
         *
         * @param <T>      the type parameter
         * @param base     The base
         * @param exponent The exponent
         * @return The result
         */
        public static <T extends Number> double pow(T base, int exponent) {
            Algebra alg = Algebra.getInstance();
            return alg.pow(base, exponent);
        }

        /**
         * Calculates the square root of a number.
         *
         * @param <T>    the type parameter
         * @param number The number
         * @return The result
         */
        public static <T extends Number> double sqrt(T number) {
            Algebra alg = Algebra.getInstance();
            return alg.sqrt(number);
        }

        /**
         * Calculates the cube root of a number.
         *
         * @param <T>    the type parameter
         * @param number The number
         * @return The result
         */
        public static <T extends Number> double cubeRoot(T number) {
            Algebra alg = Algebra.getInstance();
            return alg.cubeRoot(number);
        }

        /**
         * Finds the nth root of a number.
         *
         * @param <T>    the type parameter
         * @param number the number which I have to find nth root
         * @param n      the root
         * @return result double
         */
        public static <T extends Number> double nthRoot(T number, int n){
            Algebra alg = Algebra.getInstance();
            return alg.nthRoot(number,n);
        }

        /**
         * Returns the Absolute value of a number.
         *
         * @param number The number
         * @return The result
         */
        public static int abs(int number) {
            Algebra alg = Algebra.getInstance();
            return alg.abs(number);
        }

        /**
         * Returns the Absolute value of a number.
         *
         * @param number The number
         * @return The result
         */
        public static double abs(double number) {
            Algebra alg = Algebra.getInstance();
            return alg.abs(number);
        }

        /**
         * Returns the factorial of a number.
         *
         * @param number The number
         * @return The factorial
         */
        public static double factorial(int number){
            Factorial_UTIL fact = Factorial_UTIL.getInstance();
            return fact.factorial(number);
        }

        /**
         * Returns the greatest common divisor of two numbers.
         *
         * @param a the a
         * @param b the b
         * @return The greatest common divisor
         */
        public static int gcd(int a, int b){
            Algebra alg = Algebra.getInstance();
            return alg.gcd(a, b);
        }

        /**
         * Returns the least common multiple of two numbers.
         *
         * @param a the a
         * @param b the b
         * @return The least common multiple
         */
        public static int lcm(int a, int b){
            Algebra alg = Algebra.getInstance();
            return alg.lcm(a, b);
        }

    }

    /**
     * Contains functions to convert numbers from one base to another.
     *
     * @author Adib Sakhawat
     */
    public static class baseConverter{
        /**
         * Converts a binery number (string) to decimal number (double).
         *
         * @param bineryNumber The binery number in string format
         * @return The decimal number
         */
        public static double binToDec(String bineryNumber) {
            BaseConverter base = BaseConverter.getInstance();
            return base.binaryToDecimal(bineryNumber);
        }

        /**
         * Converts a decimal number (double) to binery number (string).
         *
         * @param decimalNumber The decimal number
         * @return The binery number in string format
         */
        public static String decToBin(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToBinary(decimalNumber);
        }

        /**
         * Converts a decimal number (double) to Hexadecimal number (string).
         *
         * @param decimalNumber The decimal number
         * @return The Hexadecimal number in string format
         */
        public static String decToHex(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToHexadecimal(decimalNumber);
        }

        /**
         * Converts a Hexadecimal number (string) to decimal number (double).
         *
         * @param hexadecimalString The Hexadecimal number in string format
         * @return The decimal number
         */
        public static double hexToDec(String hexadecimalString){
            BaseConverter base = BaseConverter.getInstance();
            return base.hexadecimalToDecimal(hexadecimalString);
        }

        /**
         * Converts an Octal number (String) to a Decimal number (double).
         *
         * @param octalString The decimal number
         * @return The Octal number in string format
         */
        public static double octToDec(String octalString){
            BaseConverter base = BaseConverter.getInstance();
            return base.octalToDecimal(octalString);
        }

        /**
         * Converts a decimal number (double) to Octal number (string).
         *
         * @param decimalNumber The decimal number
         * @return The Octal number in string format
         */
        public static String decToOct(double decimalNumber){
            BaseConverter base = BaseConverter.getInstance();
            return base.decimalToOctal(decimalNumber);
        }

        /**
         * Converts a decimal number (double) to a number of any base (string).
         *
         * @param decimalNumber the decimal number
         * @param base          the base
         * @return The number in string format
         */
        public static String decToN(double decimalNumber, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.decimalToBaseN(decimalNumber, base);
        }

        /**
         * Converts a number of any base (string) to a decimal number (double).
         *
         * @param number the number
         * @param base   the base
         * @return The decimal number
         */
        public static double nToDec(String number, int base) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.baseNToDecimal(number, base);
        }

        /**
         * Converts a binary number (string) to an octal number (string).
         *
         * @param binaryString the binary string
         * @return string
         */
        public static String binToOct(String binaryString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToOctal(binaryString);
        }

        /**
         * Converts an octal number (string) to a binary number (string).
         *
         * @param octalString the octal string
         * @return The binary number in string format
         */
        public static String octToBin(String octalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToBinary(octalString);
        }

        /**
         * Converts a binary number (string) to a hexadecimal number (string).
         *
         * @param binaryString the binary string
         * @return The hexadecimal number in string format
         */
        public static String binToHex(String binaryString) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToHexadecimal(binaryString);
        }

        /**
         * Converts a hexadecimal number (string) to a binary number (string).
         *
         * @param hexadecimalString the hexadecimal string
         * @return The binary number in string format
         */
        public static String hexToBin(String hexadecimalString) {
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToBinary(hexadecimalString);
        }

        /**
         * Converts a binary number (string) to a number of any base (string).
         *
         * @param binaryString the binary string
         * @param base         the base
         * @return The number in string format
         */
        public static String binToN(String binaryString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.binaryToBaseN(binaryString, base);
        }

        /**
         * Converts a number from octal to hexadecimal
         *
         * @param octalString the octal string
         * @return The hexadecimal number in string format
         */
        public static String octToHex(String octalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToHexadecimal(octalString);
        }

        /**
         * Converts a number from hexadecimal to octal
         *
         * @param hexadecimalString the hexadecimal string
         * @return The octal number in string format
         */
        public static String hexToOct(String hexadecimalString){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToOctal(hexadecimalString);
        }

        /**
         * Converts a number from octal to any base
         *
         * @param octalString the octal string
         * @param base        the base
         * @return The number in string format
         */
        public static String octToN(String octalString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.octalToBaseN(octalString, base);
        }

        /**
         * Converts a number from hexadecimal to any base
         *
         * @param hexadecimalString the hexadecimal string
         * @param base              the base
         * @return The number in string format
         */
        public static String hexToN(String hexadecimalString, int base){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.hexadecimalToBaseN(hexadecimalString, base);
        }

        /**
         * Converts a number from any base to any base
         *
         * @param baseNString the base n string
         * @param baseN       the base n
         * @param baseK       the base k
         * @return The binary number in string format
         */
        public static String nToK(String baseNString, int baseN, int baseK){
            BaseConverter baseConverter = BaseConverter.getInstance();
            return baseConverter.baseNToBaseK(baseNString, baseN, baseK);
        }


    }

    /**
     * Contains functions to calculate trigonometric relations and values for numbers in radian and degree.
     *
     * @author Tahsin Islam
     */
    public static class Trigonometry{
        /**
         * Returns the conversion of degree to radian.
         *
         * @param angleDegree The angle in degree
         * @return The angle in radian
         */
        public static double degreeToRadian(double angleDegree){
           trigonometry trig = trigonometry.getInstance();
           return trig.degreeToRadian(angleDegree);
       }

        /**
         * Returns the conversion of radian to degree.
         *
         * @param angleRadian The angle in radian
         * @return The angle in degree
         */
        public static double radianToDegree(double angleRadian) {
            trigonometry trig = trigonometry.getInstance();
            return trig.radianToDegree(angleRadian);
        }

        /**
         * Returns the sine of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         * Returns the cosine of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         * Returns the tangent of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         * Returns the cotangent of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         * Returns the secant of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         * Returns the cosecant of an angle given in radian or degree.
         *
         * @param angle The angle
         * @param unit  The unit of the angle
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
         *
         * @param number The number
         * @param unit   The unit of the angle to return
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
     *
     * @author Takia Farhin
     */
    public static class combinatorics{
        /**
         * Calculates the combination value.
         *
         * @param n the n
         * @param r the r
         * @return the combination value.
         */
        public static double combination(int n, int r){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.combination(n,r);
        }

        /**
         * Calculates the permutation value.
         *
         * @param n the n
         * @param r the r
         * @return the permutation value.
         */
        public static double permutation(int n, int r){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.permutation(n,r);
        }

        /**
         * Returns the number of subsets of a set.
         *
         * @param n The number of elements in the set
         * @return The number of subsets
         */
        public static double numberOfSubsets(int n){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.numberOfSubsets(n);
        }

        /**
         * Returns the number of subsets of a set. The set have to be an array of integers.
         *
         * @param set The set
         * @return All the subsets possible
         */
        public static ArrayList<ArrayList<Integer>> generateSubsets(Integer[] set){
            Combinatorics comb = Combinatorics.getInstance();
            return comb.generateSubsets(set);
        }
    }

    /**
     * Contains functions to calculate the determinant, inverse, transpose, addition, subtraction, multiplication, and more of matrices.
     *
     * @author Adib Sakhawat
     */
    public static class matrix{
        /**
         * Returns the addition of two matrices.
         *
         * @param a The first matrix
         * @param b The second matrix
         * @return The addition of the two matrices
         */
        public static Matrix add(Matrix a, Matrix b){
            return a.add(b);
        }

        /**
         * Returns the subtraction of two matrices.
         *
         * @param a The first matrix
         * @param b The second matrix
         * @return The subtraction of the two matrices
         */
        public static Matrix subtract(Matrix a, Matrix b){
            return a.subtract(b);
        }

        /**
         * Returns the multiplication of two matrices.
         *
         * @param a The first matrix
         * @param b The second matrix
         * @return The multiplication of the two matrices
         */
        public static Matrix multiply(Matrix a, Matrix b){
            return a.multiply(b);
        }

        /**
         * Returns the multiplication of a matrix and a number.
         *
         * @param m The matrix
         * @param x The number
         * @return The multiplication of the matrix and the number
         */
        public static Matrix multiply(Matrix m, double x){
            return m.multiply(x);
        }

        /**
         * Returns the transpose of a matrix.
         *
         * @param a The matrix
         * @return The transpose of the matrix
         */
        public static Matrix transpose(Matrix a){
            return a.transpose();
        }

        /**
         * Returns the inverse of a matrix.
         *
         * @param a The matrix
         * @return The inverse of the matrix
         */
        public static Matrix inverse(Matrix a){
            return a.inverse();
        }

        /**
         * Returns the determinant of a matrix.
         *
         * @param a The matrix
         * @return The determinant of the matrix
         */
        public static double determinant(Matrix a){
            return a.getDeterminant();
        }

        /**
         * Returns a matrix of zeros of the given size.
         *
         * @param rows The number of rows
         * @param cols The number of columns
         * @return The matrix of zeros
         */
        public static Matrix zeros(int rows, int cols) {
            double[][] data = new double[rows][cols];
            return new Matrix(data);
        }

        /**
         * Returns a matrix of ones of the given size.
         *
         * @param rows The number of rows
         * @param cols The number of columns
         * @return The matrix of ones
         */
        public static Matrix ones(int rows, int cols) {
            double[][] data = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i][j] = 1;
                }
            }
            return new Matrix(data);
        }

        /**
         * Returns an identity matrix of the given size.
         *
         * @param n The size of the matrix
         * @return The identity matrix
         */
        public static Matrix eye(int n) {
            double[][] data = new double[n][n];
            for (int i = 0; i < n; i++) {
                data[i][i] = 1;
            }
            return new Matrix(data);
        }

        /**
         * Compares two matrices.
         *
         * @param a The first matrix
         * @param b The second matrix
         * @return true if the matrices are equal, else false
         */
        public static boolean compare(Matrix a, Matrix b){
            return a.isEqual(b);
        }

        /**
         * Returns the power of a matrix.
         *
         * @param a     The matrix
         * @param power The power
         * @return The power of the matrix
         */
        public static Matrix pow(Matrix a, int power){
            return a.pow(power);
        }

    }

    /**
     * Contains functions to calculate vector operations
     *
     * @author Adib Sakhawat
     */
    public static class Vector{
        /**
         * Add vector.
         *
         * @param a the a
         * @param b the b
         * @return the vector
         */
        public static vector add(vector a, vector b){
            return a.add(b);
        }

        /**
         * Subtract vector.
         *
         * @param a the a
         * @param b the b
         * @return the vector
         */
        public static vector subtract(vector a, vector b){
            return a.subtract(b);
        }

        /**
         * Scaler product double.
         *
         * @param a the a
         * @param b the b
         * @return the double
         */
        public static double scalerProduct(vector a, vector b){
            return a.scalerProduct(b);
        }

        /**
         * Vector product vector.
         *
         * @param a the a
         * @param b the b
         * @return the vector
         */
        public static vector vectorProduct(vector a, vector b){
            return a.vectorProduct(b);
        }

        /**
         * Multiply vector.
         *
         * @param a the a
         * @param m the m
         * @return the vector
         */
        public static vector multiply(vector a, Matrix m){
            return a.multiply(m);
        }

        /**
         * Compare boolean.
         *
         * @param a the a
         * @param b the b
         * @return the boolean
         */
        public static boolean compare(vector a, vector b){
            return a.isEqual(b);
        }

        /**
         * Magnitude double.
         *
         * @param a the a
         * @return the double
         */
        public static double magnitude(vector a){
            return a.getMagnitude();
        }

        /**
         * Unit vector vector.
         *
         * @param a the a
         * @return the vector
         */
        public static vector unitVector(vector a){
            return a.getUnitVector();
        }
    }

    /**
     * Contains functions to calculate coordinate geometric operations.
     *
     * @author Tahsin Islam
     */
    public static class geometry{
        /**
         * Returns the distance between two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param c  The type of distance to return
         * @return The distance between the two points
         */
        public static double distance(Point p1, Point p2, DistanceType c){
            Geometry geo = Geometry.getInstance();
            if(c == DistanceType.CARTESIAN){
                return geo.distanceCartesian(p1, p2);
            }
            else if(c == DistanceType.MANHATTAN){
                return geo.manhattanDistance(p1, p2);
            }
            else if(c == DistanceType.CHEBYSHEV){
                return geo.chebyshevDistance(p1, p2);
            }
            else{
                return geo.distancePolar(p1, p2);
            }
        }

        /**
         * Returns the slope of a line given two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @return The slope
         */
        public static double slope(Point p1, Point p2){
            Geometry geo = Geometry.getInstance();
            return geo.slope(p1, p2);
        }

        /**
         * Returns the midpoint of given two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @return The midpoint
         */
        public static Point midpoint(Point p1, Point p2) {
            Geometry geo = Geometry.getInstance();
            return geo.midpoint(p1, p2);
        }

        /**
         * Returns the centroid of given three points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param p3 The third point
         * @return The centroid
         */
        public static Point centroid(Point p1, Point p2, Point p3){
            Geometry geo = Geometry.getInstance();
            return geo.centroid(p1, p2, p3);
        }

        /**
         * Returns the area of a triangle given three points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param p3 The third point
         * @return The area of the triangle
         */
        public static double areaOfTriangle(Point p1, Point p2, Point p3){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfTriangle(p1, p2, p3);
        }

        /**
         * Returns the interleave point of two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param m  the m
         * @param n  the n
         * @return The interleave point
         */
        public static Point interleaverPoint(Point p1, Point p2, double m, double n){
            Geometry geo = Geometry.getInstance();
            return geo.interleaverPoint(p1, p2, m, n);
        }

        /**
         * Returns the externalizer point of two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param m  the m
         * @param n  the n
         * @return The externalizer point
         */
        public static Point externalizerPoint(Point p1, Point p2, double m, double n){
            Geometry geo = Geometry.getInstance();
            return geo.externalizerPoint(p1, p2, m, n);
        }

        /**
         * Returns the area of a circle given two end points of the radius.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @return The area of the circle
         */
        public static double areaOfCircle(Point p1, Point p2){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfCircle(p1, p2);
        }

        /**
         * Returns the circumference of a circle given two end points of the radius.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @return The circumference of the circle
         */
        public static double circumferenceOfCircle(Point p1, Point p2){
            Geometry geo = Geometry.getInstance();
            return geo.circumferenceOfCircle(p1, p2);
        }

        /**
         * Returns if the given three points form a triangle is of the given type.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param p3 The third point
         * @param c  The type of triangle to check
         * @return true if the triangle is of the given type, else false
         */
        public static boolean isTriangle(Point p1, Point p2, Point p3, triangleType c){
            Geometry geo = Geometry.getInstance();
            if(c == triangleType.EQUILATERAL){
                return geo.isEquilateralTriangle(p1, p2, p3);
            }
            else if(c == triangleType.ISOSCELES){
                return geo.isIsoscelesTriangle(p1, p2, p3);
            }
            else if(c == triangleType.SCALENE){
                return geo.isScaleneTriangle(p1, p2, p3);
            }
            else if(c == triangleType.RIGHTANGLE){
                return geo.isRightTriangle(p1, p2, p3);
            }
            else if(c == triangleType.OBTUSE){
                return geo.isObtuseTriangle(p1, p2, p3);
            }
            else{
                return geo.isAcuteTriangle(p1, p2, p3);
            }
        }

        /**
         * Return the angle between two slopes.
         *
         * @param m1 The first slope
         * @param m2 The second slope
         * @return The angle between the two slopes
         */
        public static double angleBetweenTwoSlopes(double m1, double m2){
            Geometry geo = Geometry.getInstance();
            return geo.angleBetweenTwoSlopes(m1, m2);
        }

        /**
         * Returns if the given four points form a quadrilateral is of the given type.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @param p3 The third point
         * @param p4 The fourth point
         * @param c  The type of quadrilateral to check
         * @return true if the quadrilateral is of the given type, else false
         */
        public static boolean isQuadrilateral(Point p1, Point p2, Point p3, Point p4, quadrilateralType c){
            Geometry geo = Geometry.getInstance();
            if(c == quadrilateralType.SQUARE){
                return geo.isSquare(p1, p2, p3, p4);
            }
            else if(c == quadrilateralType.RECTANGLE){
                return geo.isRectangle(p1, p2, p3, p4);
            }
            else if(c == quadrilateralType.RHOMBUS){
                return geo.isRhombus(p1, p2, p3, p4);
            }
            else{
                return geo.isParallelogram(p1, p2, p3, p4);
            }
        }

        /**
         * Returns if the given two lines are of the given type.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @param c  The type of line to check
         * @return true if the line is of the given type, else false
         */
        public static boolean isLine(Line l1, Line l2, lineType c){
            Geometry geo = Geometry.getInstance();
            if(c == lineType.SAME){
                return geo.isSameLine(l1, l2);
            }
            else if(c == lineType.PARALLEL){
                return geo.isParallel(l1, l2);
            }
            else{
                return geo.isPerpendicular(l1, l2);
            }
        }

        /**
         * Returns if the given three lines are same
         *
         * @param l1 The first line
         * @param l2 The second line
         * @param l3 The third line
         * @return true if the lines are same, else false
         */
        public static boolean areThreeLinesSame(Line l1, Line l2, Line l3){
            Geometry geo = Geometry.getInstance();
            return geo.isThreeLinesSame(l1, l2, l3);
        }

        /**
         * Returns the intersection point of two lines.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @return The intersection point
         */
        public static Point intersectionOfTwoLines(Line l1, Line l2){
            Geometry geo = Geometry.getInstance();
            return geo.intersectionPoint(l1, l2);
        }

        /**
         * Returns the slope of a line.
         *
         * @param l The line
         * @return The slope
         */
        public static double slope(Line l){
            Geometry geo = Geometry.getInstance();
            return geo.slopeOfLine(l);
        }

        /**
         * Returns the distance between two parallel lines.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @return The distance between the two lines
         */
        public static double distanceBetweenTwoParallelLines(Line l1, Line l2){
            Geometry geo = Geometry.getInstance();
            return geo.distanceBetweenTwoParallelLines(l1, l2);
        }

        /**
         * Returns the perpendicular distance of a point from a line.
         *
         * @param l The line
         * @param p The point
         * @return The perpendicular distance
         */
        public static double perpendicularDistanceFromAPointToALine(Line l, Point p){
            Geometry geo = Geometry.getInstance();
            return geo.perpendicularDistanceFromAPoint(l, p);
        }

        /**
         * Returns the perpendicular line of a line passing through a point.
         *
         * @param l The line
         * @param p The point
         * @return The perpendicular line of the line passing through the point
         */
        public static Line getPerpendicularLine(Line l, Point p){
            Geometry geo = Geometry.getInstance();
            return geo.getPerpendicularLine(l, p);
        }

        /**
         * Returns the parallel line of a line passing through a point.
         *
         * @param l The line
         * @param p The point
         * @return The parallel line of the line passing through the point
         */
        public static Line getParallelLine(Line l, Point p) {
            Geometry geo = Geometry.getInstance();
            return geo.getParallelLine(l, p);
        }

        /**
         * Returns the line passing through the intersection point of two lines.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @param p  the p
         * @return The line passing through the intersection point of the two lines
         */
        public static Line getLineFromIntersectionPoint(Line l1, Line l2, Point p){
            Geometry geo = Geometry.getInstance();
            return geo.getLineFromIntersectingPoint(l1, l2, p);
        }

        /**
         * Returns the area of a quadrilateral using four lines inputted in anticlockwise order.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @param l3 The third line
         * @param l4 The fourth line
         * @return The area of the quadrilateral
         */
        public static double areaOfQuadrilateral(Line l1, Line l2, Line l3, Line l4){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfQuadrilateralUsingLine(l1, l2, l3, l4);
        }

        /**
         * Returns the area of a quadrilateral using points inputted in anti-clockwise order.
         *
         * @param p1 The first point in cartesian coordinates
         * @param p2 The second point in cartesian coordinates
         * @param p3 The third point in cartesian coordinates
         * @param p4 The fourth point in cartesian coordinates
         * @return The area of the quadrilateral
         */
        public static double areaOfQuadrilateral(Point p1, Point p2, Point p3, Point p4){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfQuadrilateral(p1, p2, p3, p4);
        }

        /**
         * Returns the area of a triangle given three lines.
         *
         * @param l1 The first line
         * @param l2 The second line
         * @param l3 The third line
         * @return The area of the triangle
         */
        public static double areaOfTriangle(Line l1, Line l2, Line l3){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfTriangleGivenLine(l1, l2, l3);
        }

        /**
         * Returns the area of a convex polygon using points inputted in anticlockwise order.
         *
         * @param points The points of the convex polygon
         * @return The area of the convex polygon
         */
        public static double areaOfConvexPolygon(Point[] points){
            Geometry geo = Geometry.getInstance();
            return geo.areaOfConvexPolygon(points);
        }

        /**
         * Returns if the point is inside the polygon or not.
         *
         * @param points The points of the polygon
         * @param p      The point
         * @return True if the point is inside the polygon, false otherwise
         */
        public static boolean isPointInPolygon(Point[] points, Point p){
            Geometry geo = Geometry.getInstance();
            return geo.isPointInPolygon(points, p);
        }

        /**
         * Returns the line passing through two points.
         *
         * @param p1 The first point
         * @param p2 The second point
         * @return The line passing through the two points
         */
        public static Line getLineFromTwoPoints(Point p1, Point p2){
            Geometry geo = Geometry.getInstance();
            return geo.getLineFromTwoPoints(p1, p2);
        }

    }

    /**
     * Contains functions to calculate bitwise operations.
     *
     * @author Takia Farhin
     */
    public static class bitwise {

        /**
         * Return the bitwise And value
         *
         * @param a is the given value
         * @param b is the given value
         * @return AND value
         */
        public static int and(int a, int b) {
            Bitwise bit = Bitwise.getInstance();
            return bit.BitWiseAND(a, b);
        }

        /**
         * Return the bitwise OR value
         *
         * @param a is the given value
         * @param b is the given value
         * @return OR value
         */
        public static int or(int a, int b) {
            Bitwise bit = Bitwise.getInstance();
            return bit.BitWiseOR(a, b);
        }

        /**
         * Return the bitwise XOR value
         *
         * @param a is the given value
         * @param b is the given value
         * @return XOR value
         */
        public static int xor(int a, int b) {
            Bitwise bit = Bitwise.getInstance();
            return bit.BitWiseXOR(a, b);
        }

        /**
         * Return the bitwise NOT value
         *
         * @param a is the given value
         * @return NOT value
         */
        public static int not(int a) {
            Bitwise bit = Bitwise.getInstance();
            return bit.BitWiseNOT(a);
        }


        /**
         * Return the leftshift value
         * @param a the int value
         * @param b is the value of how much value need to be shifted
         * @param st is the sign type
         * @return the rightshift value
         */
        public static int leftShift(int a, int b, signType st){
            Bitwise bit = Bitwise.getInstance();
            if(st == signType.UNSIGNED){
                return bit.leftShift(a, b, true);
            }
            else{
                return bit.leftShift(a, b, false);
            }
        }

        /**
         * Return the rightshift value
         * @param a the int value
         * @param b is the value of how much value need to be shifted
         * @param st is the sign type
         * @return the rightshift value
         */
        public static int rightShift(int a, int b, signType st){
            Bitwise bit = Bitwise.getInstance();
            if(st == signType.SIGNED){
                return bit.rightShift(a, b, false);
            }
            else{
                return bit.rightShift(a, b, true);
            }
        }
        /**
         * Returns the binary representation of a number.
         *
         * @param a The number to be converted
         * @param b The number of bits to shift
         * @return The binary representation of the number
         */
        public static String zeroFillRightShift(int a, int b){
            Bitwise bit = Bitwise.getInstance();
            return bit.bitwiseZeroFillRightShift(a, b);
        }

        /**
         * Returns the n'th byte of the integer a.
         * @param a The integer
         * @param n The byte number
         * @param st The sign type
         * @return The n'th byte of the integer a
         */
        public static int getByte(int a, int n, signType st){
            Bitwise bit = Bitwise.getInstance();
            if(st == signType.UNSIGNED){
                return bit.getByte(a, n, true);
            }
            else{
                return bit.getByte(a, n, false);
            }
        }

        /**
         * Returns an integer where the bit at position i in a is set to 0, and all other bits remain unchanged.
         * @param a The integer
         * @param i The position
         * @return The integer where the bit at position i in a is set to 0
         */
        public static int setBit0(int a, int i){
            Bitwise bit = Bitwise.getInstance();
            return bit.setBit0(a, i);
        }

        /**
         * Returns an integer where the bit at position i in a is set to 1, and all other bits remain unchanged.
         * @param a The integer
         * @param i The position
         * @return The integer where the bit at position i in a is set to 1
         */
        public static int setBit1(int a, int i) {
            Bitwise bit = Bitwise.getInstance();
            return bit.setBit1(a, i);
        }

        /**
         * Returns an integer where the bit at position i in a is flipped
         * @param a The integer on which to operate.
         * @param i  The bit position to toggle.
         * @return an integer where the bit at position i in n is flipped
         */
        public static int toggleBit(int a, int i) {
            Bitwise bit = Bitwise.getInstance();
            return bit.toggleBit(a, i);
        }

        /**
         * Returns an integer resulting from the logical right shift
         * @param x The integer on which to perform the shift.
         * @param n The number of positions to shift to the right.
         * @param st The sign type
         * @return an integer resulting from the logical right shift
         */
        public static int logicalShift(int x, int n, signType st) {
            Bitwise bit = Bitwise.getInstance();
            if(st == signType.UNSIGNED){
                return bit.logicalShift(x, n, true);
            }
            else{
                return bit.logicalShift(x, n, false);
            }
        }

        /**
         * Returns  an integer resulting from the right rotation
         * @param x The integer on which to perform the rotation.
         * @param n The number of positions to rotate to the right.
         * @param st The sign type
         * @return an integer resulting from the right rotation
         */
        public static int rightRotate(int x, int n, signType st) {
            Bitwise bit = Bitwise.getInstance();
            if (st == signType.UNSIGNED) {
                return bit.rotateRight(x, n, true);
            } else {
                return bit.rotateRight(x, n, false);
            }
        }

        /**
         * Returns  an integer resulting from the left rotation
         * @param x The integer on which to perform the rotation.
         * @param n The number of positions to rotate to the left.
         * @param st The sign type
         * @return an integer resulting from the left rotation
         */
        public static int leftRotate(int x, int n, signType st) {
            Bitwise bit = Bitwise.getInstance();
            if (st == signType.UNSIGNED) {
                return bit.rotateLeft(x, n, true);
            } else {
                return bit.rotateLeft(x, n, false);
            }
        }

        /**
         * returns true if the addition of a and b does not result in overflow, and false otherwise.
         * @param a The first integer operand.
         * @param b The second integer operand.
         * @param st The sign type
         * @return true if the addition of x and y does not result in overflow, and false otherwise.
         */
        public static boolean addOK(int a, int b, signType st) {
            Bitwise bit = Bitwise.getInstance();
            if (st == signType.UNSIGNED) {
                return bit.addOK(a, b, true);
            } else {
                return bit.addOK(a, b, false);
            }
        }
    }

}
