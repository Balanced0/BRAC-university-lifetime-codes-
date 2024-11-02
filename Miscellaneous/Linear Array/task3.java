//Reverse an Array
import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int[] reversedArr = new int[n];
        for(int i = n - 1; i >= 0; i--){
            reversedArr[j] = arr[i];
            j++;
        }
        for(int i = 0; i < n; i++){
            System.out.print(reversedArr[i]);
        }
    }
}