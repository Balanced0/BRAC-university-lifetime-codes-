import java.util.Scanner;
public class Task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        System.out.println("Divisors of " + a + ":");
        while(i <= a){
            if(a%i == 0){
                System.out.println(i);
            }
            i++;
            
        }
        
        sc.close();
    }
}