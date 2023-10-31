package mathvoyage;

public class matOparation {
    private static matOparation instance;

    private matOparation() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static matOparation getInstance() {
        if (instance == null) {
            instance = new matOparation();
        }
        return instance;
    }

    /**
     * Returns matrix filled with 0s
     * @param rows Number of rows
     *             @param cols Number of columns
     *                         @return Matrix filled with 0s
     */
    public Matrix zeros(int rows, int cols) {
        double[][] data = new double[rows][cols];
        return new Matrix(data);
    }

    /**
     * Returns matrix filled with 1s
     * @param rows Number of rows
     *             @param cols Number of columns
     *                         @return Matrix filled with 1s
     */
    public Matrix ones(int rows, int cols) {
        double[][] data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = 1;
            }
        }
        return new Matrix(data);
    }

    /**
     * Returns the Identity square matrix of size n
     * @param n Size of the matrix
     *          @return Identity matrix of size n
     */
    public Matrix eye(int n) {
        double[][] data = new double[n][n];
        for (int i = 0; i < n; i++) {
            data[i][i] = 1;
        }
        return new Matrix(data);
    }

    /**
     * Power matrix to the given exponent
     * @param a Matrix to be powered
     *          @param exponent Exponent to power the matrix to
     *                          @return Powered matrix
     */
    public Matrix pow(Matrix a, int exponent) {
        Matrix result = a;
        if (exponent == 0) {
            return eye(a.getRows());
        } else if (exponent > 0) {
            for (int i = 0; i < exponent - 1; i++) {
                result = result.multiply(a);
            }
            return result;
        } else {
            throw new IllegalArgumentException("Exponent must be positive");
        }
    }

    public boolean compareMatrixEquality(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            return false;
        }
        else {
            for (int i = 0; i < a.getRows(); i++) {
                for (int j = 0; j < a.getCols(); j++) {
                    if (a.get(i, j) != b.get(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }


}
