/**
 * Algebra.java
 */

public class Algebra {
    private static Algebra instance;

    private Algebra() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return
     */
    public static Algebra getInstance() {
        if (instance == null) {
            instance = new Algebra();
        }
        return instance;
    }

    /**
     * Returns the minimum of two comparable objects.
     * @param a The first object
     * @param b The second object
     * @return The minimum of the two objects
     */
    public <T extends Comparable<T>> T min(T a, T b) {
        try {
            if (a.compareTo(b) < 0) {
                return a;
            } else {
                return b;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    /**
     * Returns the minimum of an array of comparable objects.
     * @param array The array of objects
     * @return The minimum of the array
     */
    public <T extends Comparable<T>> T min(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(min) < 0) {
                    min = array[i];
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

        return min;
    }

    /**
     * Returns the maximum of two comparable objects.
     * @param a The first object
     * @param b The second object
     * @return The maximum of the two objects
     */
    public <T extends Comparable<T>> T max(T a, T b) {
        try {
            if (a.compareTo(b) > 0) {
                return a;
            } else {
                return b;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    /**
     * Returns the maximum of an array of comparable objects.
     * @param array The array of objects
     * @return The maximum of the array
     */
    public <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

        return max;
    }

    /**
     * returns the index of the minimum of an array of comparable objects.
     * @param array The array of objects
     * @return The index of the minimum of the array
     */
    public <T extends Comparable<T>> int minIndex(T[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int minIndex = 0;
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[minIndex]) < 0) {
                    minIndex = i;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }

        return minIndex;
    }

    /**
     * returns the index of the maximum of an array of comparable objects.
     * @param array The array of objects
     * @return The index of the maximum of the array
     */
    public <T extends Comparable<T>> int maxIndex(T[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        try {
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[maxIndex]) > 0) {
                    maxIndex = i;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }

        return maxIndex;
    }

    /**
     * Calculates the power of a number.
     * @param base The base
     * @param exponent The exponent
     * @return The result
     */
    public <T extends Number>double pow(T base, int exponent) {
        double result = 1;
        if(exponent == 0) {
            return 1;
        }
        else if(exponent > 0) {
            for(int i = 0; i < exponent; i++) {
                result *= base.doubleValue();
            }
            return result;
        }
        else {
            for(int i = 0; i > exponent; i--) {
                result /= base.doubleValue();
            }
            return result;
        }
    }

    /**
     * Calculates the square root of a number.
     * @param number The number
     * @return The result
     */
    public <T extends Number> double sqrt(T number) {
        double x0 = number.doubleValue(); // Initial guess
        double epsilon = 1e-6; // A small value to determine the desired precision


        while (true) {
            double x1 = 0.5 * (x0 + number.doubleValue() / x0); // Calculate the next approximation

            // Check for convergence (desired precision)
            if (Math.abs(x1 - x0) < epsilon) {
                return x1; // Return the approximate square root
            }

            x0 = x1; // Update the approximation for the next iteration
        }
    }

}
