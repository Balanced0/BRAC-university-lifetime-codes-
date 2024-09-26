import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("Original array:");
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After modifying:");
        for(int i = 0; i < N; i++){
            if(arr[i] < 0 || arr[i] == 0){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }
}