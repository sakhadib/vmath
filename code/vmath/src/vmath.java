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

}
