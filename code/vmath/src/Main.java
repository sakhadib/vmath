public class Main {
    public static void main(String[] args) {

        int[][] arr1 = {{1}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(arr1);
        Matrix matrix2 = new Matrix(arr2);

        matrix1.printMatrix();
        matrix2.printMatrix();

        vmath.addMatrix(matrix1, matrix2).printMatrix();
    }
}