//Count occurances of an element
import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}