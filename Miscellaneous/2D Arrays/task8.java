public class task8{
    public static void main(String[] args){
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < col; i++){
            int sum = 0;
            for(int j = 0 ; j  < row; j++){
                sum = sum + arr[j][i];
            }
            System.out.print(sum + ", ");
        }
        
    }
}