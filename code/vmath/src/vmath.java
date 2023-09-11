public class vmath {
    // MATRIX MANIPULATION
    /**
     * Add two matrices
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return result matrix
     */
    public static Matrix addMatrix(Matrix matrix1, Matrix matrix2){
        if (matrix1.NumberOfRows() != matrix2.NumberOfRows() || matrix1.NumberOfCols() != matrix2.NumberOfCols()) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");
        }
        return matrix1.add(matrix2);
    }

    /**
     * Subtract two matrices
     * (matrix1 - matrix2)
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return result matrix
     */
    public static Matrix subtractMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.NumberOfRows() != matrix2.NumberOfRows() || matrix1.NumberOfCols() != matrix2.NumberOfCols()) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction.");
        }
        return matrix1.subtract(matrix2);
    }

    /**
     * Multiply two matrices
     * @param matrix1 first matrix (left)
     *                (m x n)
     *                m = rows
     *                n = cols
     *                (m x n) * (n x p) = (m x p)
     * @param matrix2 second matrix (right)
     *                (n x p)
     *                p = cols
     *                (m x n) * (n x p) = (m x p)
     *                n must equal n
     * @return result matrix
     */
    public static Matrix multiplyMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.NumberOfCols() != matrix2.NumberOfRows()) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }
        if (matrix1.NumberOfCols() == matrix1.NumberOfRows() && matrix2.NumberOfCols() == matrix2.NumberOfRows()) {
            int numRows1 = matrix1.NumberOfRows();
            int numCols1 = matrix1.NumberOfCols();
            int numRows2 = matrix2.NumberOfRows();
            int numCols2 = matrix2.NumberOfCols();

            Matrix modifiedMatrix1 = new Matrix(numRows1 + 1, numCols1 + 1);
            Matrix modifiedMatrix2 = new Matrix(numRows2 + 1, numCols2 + 1);

            // Copy values from matrix1 to modifiedMatrix1
            for (int i = 0; i < numRows1; i++) {
                for (int j = 0; j < numCols1; j++) {
                    modifiedMatrix1.setValue(i, j, matrix1.getValue(i, j));
                }
            }

            // Fill the extra row and column of modifiedMatrix1 with '0' values
            for (int i = 0; i <= numRows1; i++) {
                modifiedMatrix1.setValue(i, numCols1, 0);
            }
            for (int j = 0; j <= numCols1; j++) {
                modifiedMatrix1.setValue(numRows1, j, 0);
            }

            // Copy values from matrix2 to modifiedMatrix2
            for (int i = 0; i < numRows2; i++) {
                for (int j = 0; j < numCols2; j++) {
                    modifiedMatrix2.setValue(i, j, matrix2.getValue(i, j));
                }
            }

            // Fill the extra row and column of modifiedMatrix2 with '0' values
            for (int i = 0; i <= numRows2; i++) {
                modifiedMatrix2.setValue(i, numCols2, 0);
            }
            for (int j = 0; j <= numCols2; j++) {
                modifiedMatrix2.setValue(numRows2, j, 0);
            }

            return checkAndtrimMatrix(modifiedMatrix1.multiply(modifiedMatrix2));
        }
        return matrix1.multiply(matrix2);
    }

    private static Matrix checkAndtrimMatrix(Matrix inputMatrix) {
        int numRows = inputMatrix.NumberOfRows();
        int numCols = inputMatrix.NumberOfCols();

        // Check if the last row contains all zeros
        boolean lastRowAllZeros = true;
        for (int j = 0; j < numCols; j++) {
            if (inputMatrix.getValue(numRows - 1, j) != 0) {
                lastRowAllZeros = false;
                break;
            }
        }

        // Check if the last column contains all zeros
        boolean lastColumnAllZeros = true;
        for (int i = 0; i < numRows; i++) {
            if (inputMatrix.getValue(i, numCols - 1) != 0) {
                lastColumnAllZeros = false;
                break;
            }
        }

        // If both the last row and last column have all zeros, trim them
        if (lastRowAllZeros && lastColumnAllZeros) {
            Matrix trimmedMatrix = new Matrix(numRows - 1, numCols - 1);

            for (int i = 0; i < numRows - 1; i++) {
                for (int j = 0; j < numCols - 1; j++) {
                    trimmedMatrix.setValue(i, j, inputMatrix.getValue(i, j));
                }
            }

            return trimmedMatrix;
        } else {
            // If not all zeros in last row or last column, return the input matrix as is
            return inputMatrix;
        }
    }

    /**
     * Calculate the determinant of a matrix
     * @param matrix matrix to calculate determinant of
     * @return determinant of matrix
     */
    public static int detMatrix(Matrix matrix) {
        if (matrix.NumberOfRows() != matrix.NumberOfCols()) {
            throw new IllegalArgumentException("Matrix must be square to calculate determinant.");
        }
        return matrix.determinant();
    }



































    
}
