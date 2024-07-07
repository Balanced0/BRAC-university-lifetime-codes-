import java.util.Scanner;
public class loops8{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int count = 0;
         int i = 1;
         while (i <= a){
             if(a%i == 0){
                 count++;
             }
             i++;
         }
         if(count == 2)
         {
             System.out.println("This is a prime number");
         }else{
             System.out.println("This is not a prime number");
             }
    
    }
}
