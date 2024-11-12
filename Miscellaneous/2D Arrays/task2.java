public class task2{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {2, 1, 4},
            {3, 4, 1}
        };
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Initialize transpose matrix
        int[][] transpose = new int[cols][rows];
        
        // Compute transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print transpose matrix
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}