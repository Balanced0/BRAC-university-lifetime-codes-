import java.util.Scanner;
public class task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        int b = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < N; i++){
            if(b == arr[i]){
                flag = true;
                System.out.println(b + " is at index " + i);
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
        
    }
}