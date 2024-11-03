//Check if Array is Sorted
import java.util.Scanner;
public class task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i = 0; i < n - 1; i++){
            int j = i + 1;
            if(arr[i] < arr[j]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}