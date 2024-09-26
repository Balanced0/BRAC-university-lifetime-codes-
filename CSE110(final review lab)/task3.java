import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isPrime(n);
        System.out.println(check);
    }
    
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
