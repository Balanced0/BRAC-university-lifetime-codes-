import java.util.*;
public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();
            }
            boolean isAsc = true;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] <= arr[j + 1]){
                    isAsc = true;
                }
                else{
                    isAsc = false;
                    System.out.println("NO");
                    break;
                }
            }
            if(isAsc){
                System.out.println("YES");
            }
        }
    }
}
