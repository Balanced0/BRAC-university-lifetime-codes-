//Find Maximum Element in Array
import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            int a = arr[i];
            if(a > max){
                max = a;
            }
        }
        System.out.println(max);
    }
}