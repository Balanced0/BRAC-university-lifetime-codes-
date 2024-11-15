import java.util.Scanner;
public class task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean checked[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!checked[i]){
                int count = 1;
                for(int j = i + 1; j<n; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        checked[j] = true;
                    }
                }
                System.out.println(arr[i] + " - " + count + " times");
            }
            
            
        }
    }
}