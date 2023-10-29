package mathvoyage;
import java.util.Random;

/**
 * voyager.Matrix class
 *
 */
public class Matrix{
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(double[][] data){
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;


    }

    public Matrix(int[][] data){
        this.data = new double[data.length][data[0].length];
        this.rows = data.length;
        this.cols = data[0].length;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[0].length; j++) {
                this.data[i][j] = data[i][j];
            }
        }

    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];

        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = rand.nextInt(9) + 1; // Generates random values between 1 and 9
            }
        }

    }

    public Matrix(double[] data, int rows, int cols){
        if(data.length != rows*cols) {
            throw new IllegalArgumentException("data length must be equal to rows*cols"
                    + "\nrows: " + rows + "\ncols: " + cols + "\ndata length: " + data.length);
        }
        else {
            this.rows = rows;
            this.cols = cols;
            this.data = new double[rows][cols];
            int k = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    this.data[i][j] = data[k];
                    k++;
                }
            }
        }
    }

    public Matrix(int[] data, int rows, int cols){
        if(data.length != rows*cols) {
            throw new IllegalArgumentException("data length must be equal to rows*cols"
                    + "\nrows: " + rows + "\ncols: " + cols + "\ndata length: " + data.length);
        }
        else {
            this.rows = rows;
            this.cols = cols;
            this.data = new double[rows][cols];
            int k = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++){
                    this.data[i][j] = data[k];
                    k++;
                }
            }
        }
    }

    public Matrix(int rows, int cols, double value){
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                this.data[i][j] = value;
            }
        }
    }

    private double calculateDeterminant() {
        if (this.rows == 2) {
            return this.data[0][0] * this.data[1][1] - this.data[0][1] * this.data[1][0];
        } else {
            double determinant = 0;
            for (int i = 0; i < this.rows; i++) {
                Matrix subMatrix = subMatrix(0, i);
                determinant += Math.pow(-1, i) * this.data[0][i] * subMatrix.calculateDeterminant();
            }
            return determinant;
        }
    }

    private Matrix subMatrix(int row, int col) {
        double[][] newData = new double[this.rows - 1][this.cols - 1];
        int currentRow = 0;
        for (int i = 0; i < this.rows; i++) {
            if (i == row) continue;
            int currentCol = 0;
            for (int j = 0; j < this.cols; j++) {
                if (j == col) continue;
                newData[currentRow][currentCol] = this.data[i][j];
                currentCol++;
            }
            currentRow++;
        }
        return new Matrix(newData);
    }

    public double getDeterminant(){
        if(this.rows != this.cols){
            throw new IllegalArgumentException("Matrix must be square");
        }else{
            return this.calculateDeterminant();
        }
    }




    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public double[][] getData(){
        return data;
    }

    public double get(int row, int col){
        return data[row][col];
    }

    public Matrix add(Matrix b){
        if (this.rows != b.rows || this.cols != b.cols) {
            throw new IllegalArgumentException("Matrix dimensions must be equal");
        }
        else {
            double[][] data = new double[this.rows][this.cols];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    data[i][j] = this.data[i][j] + b.data[i][j];
                }
            }
            return new Matrix(data);
        }
    }

    public Matrix subtract(Matrix b){
        if (this.rows != b.rows || this.cols != b.cols) {
            throw new IllegalArgumentException("Matrix dimensions must be equal");
        }
        else {
            double[][] data = new double[this.rows][this.cols];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++){
                    data[i][j] = this.data[i][j] - b.data[i][j];
                }
            }
            return new Matrix(data);
        }
    }

    public Matrix multiply(Matrix b) {
        if (this.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Matrix dimensions must be equal");
        } else {
            double[][] data = new double[this.getRows()][b.getCols()];
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < b.getCols(); j++) {
                    for (int k = 0; k <  this.getCols(); k++) {
                        data[i][j] += this.get(i, k) * b.get(k, j);
                    }
                }
            }
            return new Matrix(data);
        }
    }


    public Matrix multiply(double b){
        double[][] data = new double[this.rows][this.cols];
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                data[i][j] = this.data[i][j] * b;
            }
        }
        return new Matrix(data);
    }

    public Matrix transpose(){
        double[][] data = new double[this.cols][this.rows];
        for(int i = 0; i < this.cols; i++){
            for(int j = 0; j < this.rows; j++){
                data[i][j] = this.data[j][i];
            }
        }
        return new Matrix(data);
    }

    public Matrix inverse() {
        if (this.rows != this.cols) {
            throw new IllegalArgumentException("Matrix must be square");
        } else {
            int n = this.rows;
            double determinant = this.getDeterminant();
            if (determinant == 0) {
                throw new IllegalArgumentException("Matrix is not invertible");
            } else {
                double[][] data = new double[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        // Calculate the cofactor of element (i, j)
                        double cofactor = Math.pow(-1, i + j) * this.subMatrix(i, j).getDeterminant();

                        // Calculate the element of the inverse matrix
                        data[i][j] = cofactor / determinant;
                    }
                }

                // Create a new Matrix with the inverse data and return it
                return new Matrix(data).transpose();
            }
        }
    }


    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                double value = this.data[i][j];
                if (value == vmath.algebra.floor(value)) {
                    System.out.print((int)value + " ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }




}
