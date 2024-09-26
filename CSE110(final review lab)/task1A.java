import java.util.Scanner;
public class task1A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        evenChecker(a);
        boolean result = isEven(a);
        System.out.println(result);
        result = isPos(a);
        System.out.println(result);
        sequence(a);
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
    
    public static boolean isPos(int num){
        if(num > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void sequence(int n){
        if(isPos(n) == true){
            int i = 0;
            while(i <= n){
                if(i%2 == 0){
                    System.out.print(i + " ");
                }
                i++;
            }
        }
        else{
            int i = n;
            while(i < 0){
                if(i%2 != 0){
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
    
}