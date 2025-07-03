package Assignments.Java.DSA;

public class RowSum2D {

    // Method to calculate row sums
    public static int[] rowSums(int[][] grid) {
        int[] ans = new int[grid.length];
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + grid[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] rowSums = rowSums(grid);

        System.out.print("Row sums: ");
        for (int sum : rowSums) {
            System.out.print(sum + " ");
        }
    }
}
