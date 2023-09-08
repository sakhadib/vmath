public class Main {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 7},
                        {4, 5, 6}};

        int[][] arr2 = {{3, 4},
                        {6, 5},
                        {7, 8}};

        Matrix matrix1 = new Matrix(arr1);
        Matrix matrix2 = new Matrix(arr2);

        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        System.out.println();
        System.out.println();
        System.out.println("Strassen Algo:");
        vmath.multiplyMatrix(matrix1, matrix2).printMatrix();
        System.out.println();
        System.out.println("General multiplication:");
        matrix1.multiplyGeneral(matrix2).printMatrix();
    }
}