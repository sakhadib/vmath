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
                System.out.print(data[i][j] + " ");
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

}
