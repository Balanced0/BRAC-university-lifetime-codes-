import java.util.Scanner;
public class Task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        if (a < 0){
            System.out.println("Number is negative");
        }
        else if (a == 0){
            System.out.println("Number is zero");
        }
        else if (a > 0 && a%2 == 0){
            System.out.println("Number is positive and even");
        }
        else if (a > 0 && a%2 != 0){
            System.out.println("Number is positive and odd");
        }
        
        sc.close();
    }
}