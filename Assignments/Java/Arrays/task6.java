import java.util.Scanner;
public class task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double sum = 0.0;
        double arr[] = new double[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();
            sum = sum + a;
            arr[i] = a;
        }
        double max = arr[0];
        double min = arr[0];
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                a = i;
            }
            if(arr[i] < min){
                min = arr[i];
                b = i;
            }
        }
        System.out.println("Maximum element  " + max + " found at index " + a);
        System.out.println("Minimum element  " + min + " found at index " + b);
        
        System.out.printf("Summation: %.1f%n", sum);
        System.out.printf("Average: %.2f%n", (sum/n));
        
    }
}