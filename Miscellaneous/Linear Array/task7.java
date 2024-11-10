import java.util.Scanner;
public class task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[n];
        //[5, 1, 2, 3, 4]
        arr1[0] = arr[n - 1];
        int index = 1;
        for(int i = 0 ; i < n - 1; i++){
            arr1[index++] = arr[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}