import java.util.Scanner;
public class task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double arr[] = new double[n];
        System.out.println("Please enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        int u_count = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                u_count++;
            }
        }
        double arr1[] = new double[u_count];
        arr1[0] = arr[0];
        int index = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
               arr1[index] = arr[i];
               index++;
            }
        }
        System.out.print("New Array: ");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
        int rem = n - u_count;
        System.out.println();
        System.out.println("Removed elements: " + rem);
    }
}