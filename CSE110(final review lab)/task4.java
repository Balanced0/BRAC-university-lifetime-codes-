import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isPerfect(n);
        System.out.println(check);

    }
    
    public static boolean isPerfect(int n){
        int sum = 0;
        int store = n;
        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum == store){
            return true;
        }
        else{
            return false;
        }
    }
    
}