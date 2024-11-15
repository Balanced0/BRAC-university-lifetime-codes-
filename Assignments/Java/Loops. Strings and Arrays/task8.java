import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int r = sc.nextInt();
        System.out.print("column = ");
        int c = sc.nextInt();
        int n = r * c;
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int arr1[] = new int[n];
        int count = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr1[count] = arr[i][j];
                count++;
            }
        }
        System.out.println("1D Array:");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}