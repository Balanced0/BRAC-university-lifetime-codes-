import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < n; i++){
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println("The sum of " + n + " no is: " + sum);
        double average = ((double)sum/n); 
        System.out.println("The Average is: " + average);
        sc.close();
        
    }
}