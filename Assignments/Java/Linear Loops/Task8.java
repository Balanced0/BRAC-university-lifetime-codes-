import java.util.Scanner;
public class Task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(counter < 10){
            System.out.println("Enter Number:");
            int a = sc.nextInt();
            sum = sum + a;
            System.out.println("Sum = " + sum);
            counter++;
        }
    }
}