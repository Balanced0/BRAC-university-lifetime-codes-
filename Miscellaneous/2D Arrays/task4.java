public class task4{
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3}, {2, 1, 4}, {3, 4, 1}};
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        boolean notMatch = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if (matrix[i][j] != transpose[i][j]){
                    notMatch = true;
                    break;
                }
            }
        }
        if (notMatch) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}