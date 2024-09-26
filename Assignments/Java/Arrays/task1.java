import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt(); 
        int []arr = new int[n];
        int newArr[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i == 0){
                System.out.println("The elements of the array are:");
            }
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println("After resizing the array:");
        for(int i = 0; i< n; i++){
            newArr[i] = arr[i];
            System.out.print(newArr[i] + " ");
        }
        newArr[n] = b;
        System.out.print(newArr[n]);
        
    }
}
