/**
 * Matrix class
 *
 */

public class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    /**
     * Constructor
     * @param array 2D array for Matrix
     */
    public Matrix(int[][] array) {
        this.rows = array.length;
        this.cols = array[0].length;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = array[i][j];
            }
        }
    }


    /**
     * Constructor
     * @param rows number of rows
     * @param cols number of columns
     */
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    /**
     * Constructor
     * @param rows number of rows
     * @param cols number of columns
     * @param initializer value to initialize Matrix
     */
    public Matrix(int rows, int cols, int initializer){
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                this.data[i][j] = initializer;
            }
        }
    }

    /**
     * Constructor
     * @param mat Matrix to copy
     */
    public Matrix(Matrix mat) {
        this.rows = mat.rows;
        this.cols = mat.cols;
        this.data = new int[rows][cols];

        for (int i = 0; i < mat.rows; i++) {
            for (int j = 0; j < mat.cols; j++) {
                this.data[i][j] = mat.data[i][j];
            }
        }
    }

    /**
     * Get number of rows
     * @return number of rows in integer
     */
    public int NumberOfRows() {
        return rows;
    }


    /**
     * Get number of columns
     * @return number of columns in integer
     */
    public int NumberOfCols() {
        return cols;
    }

    /**
     * Get value of Matrix at index row, column
     * @param row row index
     * @param column column index
     * @return value at index row, column
     */
    public int getValue(int row, int column) {
        return data[row][column];
    }

    /**
     * Set value of Matrix at index row, column
     * @param row row index
     * @param column column index
     * @param value value to set
     */
    public void setValue(int row, int column, int value) {
        data[row][column] = value;
    }


    //print matrix
    public void printMatrix(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }


    /**
     * Add two matrices
     * @param other matrix to add
     * @return result matrix
     */
    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }


    /**
     * Subtract two matrices
     * @param other matrix to subtract
     * @return result matrix
     */
    public Matrix subtract(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }



    // Method to multiply two matrices using Strassen's algorithm

    /**
     * Multiply two matrices using Strassen's algorithm
     * @param other matrix to multiply
     * @return result matrix
     */
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }
        if(this.rows != this.cols || other.rows != other.cols){
            return multiplyGeneral(other);
        }

        int n = this.rows; // Assuming both matrices are n x n
        Matrix result = new Matrix(n,n);

        if (n == 1) {
            // Base case: Simply multiply the two single elements
            result.setValue(0,0, this.data[0][0] * other.data[0][0]);
        } else {
            // Divide the matrices into submatrices
            Matrix a11 = this.getSubMatrix(0, 0, n/2);
            Matrix a12 = this.getSubMatrix(0, n/2, n/2);
            Matrix a21 = this.getSubMatrix(n/2, 0, n/2);
            Matrix a22 = this.getSubMatrix(n/2, n/2, n/2);

            Matrix b11 = other.getSubMatrix(0, 0, n/2);
            Matrix b12 = other.getSubMatrix(0, n/2, n/2);
            Matrix b21 = other.getSubMatrix(n/2, 0, n/2);
            Matrix b22 = other.getSubMatrix(n/2, n/2, n/2);

            // Calculate intermediate matrices using Strassen's method
            Matrix m1 = a11.multiply(b12.subtract(b22));
            Matrix m2 = a11.add(a12).multiply(b22);
            Matrix m3 = a21.add(a22).multiply(b11);
            Matrix m4 = a22.multiply(b21.subtract(b11));
            Matrix m5 = a11.add(a22).multiply(b11.add(b22));
            Matrix m6 = a12.subtract(a22).multiply(b21.add(b22));
            Matrix m7 = a11.subtract(a21).multiply(b11.add(b12));

            // Calculate result submatrices
            Matrix c11 = m5.add(m4).subtract(m2).add(m6);
            Matrix c12 = m1.add(m2);
            Matrix c21 = m3.add(m4);
            Matrix c22 = m5.add(m1).subtract(m3).subtract(m7);

            // Combine the result submatrices into the final result
            result = combineSubMatrices(c11, c12, c21, c22);
        }

        // Create a new Matrix object with the result and return it
        return new Matrix(result);
    }

    // Method to get a submatrix of the current matrix
    private Matrix getSubMatrix(int startRow, int startCol, int size) {
        if (startRow < 0 || startRow + size > this.rows || startCol < 0 || startCol + size > this.cols) {
            throw new IllegalArgumentException("Submatrix indices are out of bounds.");
        }

        int[][] subMatrixData = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                subMatrixData[i][j] = this.data[startRow + i][startCol + j];
            }
        }

        return new Matrix(subMatrixData);
    }

    // Method to combine four submatrices into a single matrix
    private Matrix combineSubMatrices(Matrix c11, Matrix c12, Matrix c21, Matrix c22) {
        if (c11.rows != c12.rows || c11.cols != c21.cols || c12.cols != c22.cols || c21.rows != c22.rows) {
            throw new IllegalArgumentException("Submatrices have incompatible dimensions.");
        }
        int resultRows = c11.rows + c21.rows;
        int resultCols = c11.cols + c12.cols;
        int[][] resultData = new int[resultRows][resultCols];

        // Fill the result matrix with submatrices
        for (int i = 0; i < c11.rows; i++) {
            for (int j = 0; j < c11.cols; j++) {
                resultData[i][j] = c11.data[i][j];
                resultData[i][j + c11.cols] = c12.data[i][j];
                resultData[i + c11.rows][j] = c21.data[i][j];
                resultData[i + c11.rows][j + c11.cols] = c22.data[i][j];
            }
        }
        return new Matrix(resultData);
    }


    // Method to multiply two matrices using general algorithm

    /**
     * Multiply two matrices using general algorithm
     * @param other matrix to multiply
     * @return result matrix
     */
    public Matrix multiplyGeneral(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        int n = this.rows;
        int m = other.cols; // Number of columns in the result matrix
        int k = this.cols;
        Matrix result = new Matrix(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // Iterate up to the number of columns in the result matrix
                int sum = 0;
                for (int l = 0; l < k; l++) {
                    sum += this.data[i][l] * other.data[l][j];
                }
                result.data[i][j] = sum;
            }
        }

        // Create a new Matrix object with the result and return it
        return result;
    }

    /**
     * Determinant of a matrix
     * @return determinant of matrix
     */
    public int determinant() {
        if (rows != cols) {
            throw new IllegalArgumentException("Matrix is not square.");
        }
        return calculateDeterminant(data);
    }

    private int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;

        if (n == 1) {
            return matrix[0][0];
        }

        int det = 0;

        for (int i = 0; i < n; i++) {
            int[][] subMatrix = new int[n - 1][n - 1];

            for (int j = 1; j < n; j++) {
                for (int k = 0, l = 0; k < n; k++) {
                    if (k != i) {
                        subMatrix[j - 1][l] = matrix[j][k];
                        l++;
                    }
                }
            }

            int sign = (i % 2 == 0) ? 1 : -1;
            det += sign * matrix[0][i] * calculateDeterminant(subMatrix);
        }

        return det;
    }







}
