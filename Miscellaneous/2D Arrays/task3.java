public class task3{
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}