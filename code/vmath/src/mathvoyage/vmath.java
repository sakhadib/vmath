package mathvoyage;

public class vmath {
    public static mathvoyage.Combinatorics Combinatorics;

    /**
     * Contains Basic Algebraic functions to find min, max, min and max index of an array, factorial, and more.
     * @author Adib Sakhawat
     */
    public static class algebra{
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
        public static <T extends Comparable<T>> int maxIndex(T[] array) {
            Algebra alg = Algebra.getInstance();
            return alg.maxIndex(array);
        }

        /**
         * Returns the index of the minimum of an array of comparable objects.
         * @param array The array of objects
         * @return The index of the minimum of the array
         */
        public static <T extends Comparable<T>> int minIndex(T[] array) {
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
        public static <T extends Number> double nthroot(T number, int n){
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

    }


    public static class Trigonometry{
        /**
         * Returns the conversion of degree to radian.
         * @param angleDegree The angle in degree
         * @return The angle in radian
         */
        public static double degreeToRadians(double angleDegree){
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


    public static class baseConverter{
        public static double binaryToDecimal(String binaryString) {
            BaseConverter bc = BaseConverter.getInstance();
            return bc.binaryToDecimal(binaryString);
        }



    }


}
