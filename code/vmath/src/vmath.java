public class vmath {
    /**
     * Contains Basic Algebraic functions to find min, max, min and max index of an array, factorial, and more.
     * @author Adib Sakhawat
     */
    public class algebra{
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

    }
}
