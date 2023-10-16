package mathvoyage;

/**
 * voyager.Algebra.java
 * @author Adib Sakhawat
 */

public class Algebra {
    private static Algebra instance;

    private Algebra() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Algebra getInstance() {
        if (instance == null) {
            instance = new Algebra();
        }
        return instance;
    }


    /**
     * returns the absolute value of a number.
     * @param number The number
     * @return The absolute value
     */
    public double abs(double number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

    /**
     * returns the absolute value of a number.
     * @param number The number
     * @return The absolute value
     */
    public int abs(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
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
        double x0 = number.doubleValue();
        double epsilon = 1e-6;
        while (true) {
            double x1 = (x0 + number.doubleValue() / x0) / 2.0; // Calculate the next approximation
            if (abs(x1 - x0) < epsilon) {
                return x1;
            }

            x0 = x1;
        }
    }

    /**
     * Calculates the cube root of a number.
     * @param number The number
     * @return The result
     */
    public <T extends Number> double cubeRoot(T number) {
        double x0 = number.doubleValue();
        double epsilon = 1e-6;


        while (true) {
            double x1 = (2.0 * x0 + number.doubleValue() / (x0 * x0)) / 3.0;


            if (abs(x1 - x0) < epsilon) {
                return x1;
            }

            x0 = x1;
        }
    }

    /**
     * Finds the nth root of a number.
     * @param x the number which I have to find nth root
     * @param n the root
     * @return result
     */
    public <T extends Number> double nthRoot(T x, int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Cannot calculate 0th root.");
        }

        double epsilon = 1e-6;
        double guess = x.doubleValue() / n;

        while (true) {
            double nextGuess = ((n - 1) * guess + x.doubleValue() / pow(guess, n - 1)) / n;

            // Check for convergence (desired precision)
            if (abs(nextGuess - guess) < epsilon) {
                return nextGuess;
            }

            guess = nextGuess;
        }
    }


    /**
     * Calculates the logarithm of a number.
     * @param base The base
     * @param number The number
     * @return The result
     */







}
