import java.util.Scanner;
public class task1A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        evenChecker(a);
        boolean result = isEven(a);
        System.out.println(result);
    }
    
    public static void evenChecker(int num){
        if(num%2 == 0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}