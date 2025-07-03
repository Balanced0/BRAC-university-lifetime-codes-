package Assignments.Java.DSA.RotateOuterRing;

public class RotateOuterRing {
    public static void rotateOuter(int[][] matrix) {
        int n = matrix.length;
        int[] temp = new int[4 * (n - 1)];
        int index = 0;
        // top row
        for (int i = 0; i < n; i++) {
            temp[index++] = matrix[0][i];
        }
        // right column
        for (int i = 1; i < n; i++) {
            temp[index++] = matrix[i][n - 1];
        }
        // bottom row
        for (int i = n - 2; i >= 0; i--) {
            temp[index++] = matrix[n - 1][i];
        }
        // left column
        for (int i = n - 2; i >= 1; i--) {
            temp[index++] = matrix[i][0];
        }

        // Shift right by 1 (clockwise rotation)
        int last = temp[temp.length - 1];
        for (int i = temp.length - 1; i > 0; i--) {
            temp[i] = temp[i - 1];
        }
        temp[0] = last;
        index = 0;

        // top row
        for (int i = 0; i < n; i++) {
            matrix[0][i] = temp[index++];
        }
        // right column
        for (int i = 1; i < n; i++) {
            matrix[i][n - 1] = temp[index++];
        }
        // bottom row
        for (int i = n - 2; i >= 0; i--) {
            matrix[n - 1][i] = temp[index++];
        }
        // left column
        for (int i = n - 2; i >= 1; i--) {
            matrix[i][0] = temp[index++];
        }
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateOuter(matrix); // Your logic will go here

        System.out.println("\nMatrix after rotating outer ring:");
        printMatrix(matrix);
    }
}
