import java.util.Scanner;
public class task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while(i < j){
            int temp_i = arr[i];
            int temp_j = arr[j];
            arr[i] = temp_j;
            arr[j] = temp_i;
            i++;
            j--;
        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}