package mathvoyage;

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

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }





}
