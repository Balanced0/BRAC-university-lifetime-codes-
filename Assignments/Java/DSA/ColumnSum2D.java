package Assignments.Java.DSA;

public class ColumnSum2D {
    public static int[] columnSums(int[][] grid) {
        int[] ans = new int[grid.length];
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum = sum + grid[j][i];
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

        int[] colSums = columnSums(grid);

        System.out.print("Column sums: ");
        for (int sum : colSums) {
            System.out.print(sum + " ");
        }
    }
}
