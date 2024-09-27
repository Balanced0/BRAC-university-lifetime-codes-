//Strings + Methods
//Task 4
import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isHappyNumber(n);
        System.out.println(check);
    }
    
    public static boolean isHappyNumber(int n){
        int sum = 0;
        while(true){
             sum = 0;
             while(n > 0){
                 int a = n%10;
                 n = n/10;
                 sum = sum + a * a;
             }
             n = sum;
             if(n == 1){
                 return true;
             }
             else if(n == 4){
                 return false;
             }
        }
        
    }
}