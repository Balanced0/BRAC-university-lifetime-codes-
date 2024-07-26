import java.util.Scanner;
public class Task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Payment amount");
        int amount = sc.nextInt();
        if (age >= 18){
            if(amount < 10000){
                System.out.println("Your tax amounts in 0 Tk");
            }
            else if(amount >= 10000 && amount <= 20000){
                double tax = amount * 0.05;
                System.out.println("Your tax amounts in " + tax + " Tk");
            }
            else if(amount > 20000){
                double tax = amount * 0.1;
                System.out.println("Your tax amounts in " + tax + " Tk");
            }
        }
        else{
            System.out.println("Your tax amounts in 0 Tk");
        }
        
        sc.close();
    }
}