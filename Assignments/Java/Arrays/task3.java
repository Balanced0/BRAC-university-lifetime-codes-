import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("Reversed using a new array:");
        int newArr[] = new int[n];
        int k = 0;
        for(int i = n - 1; i >= 0; i--){
            newArr[k] = arr[i];
            System.out.print(newArr[k] + " ");
            k++;
        }
        System.out.println();
        System.out.println("Reversed the original array:");
        int i = 0;
        int j = n - 1;
        while(i<j){
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
            i++;
            j--;
        }
        for (int m = 0; m < n; m++) {
            System.out.print(arr[m] + " ");
        }
    }
}
