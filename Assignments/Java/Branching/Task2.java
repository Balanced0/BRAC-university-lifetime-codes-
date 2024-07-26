import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your exam score?");
        int a = sc.nextInt();
        if (a < 50){
            System.out.println("Your grade is F");
        }
        else if(a >= 50 && a <= 56){
            System.out.println("Your grade is D");
        }
        else if(a >= 57 && a <= 69){
            System.out.println("Your grade is C");
        }
        else if(a >= 70 && a <= 84){
            System.out.println("Your grade is B");
        }
        else if(a >= 85 && a <= 89){
            System.out.println("Your grade is A-");
        }
        else{
            System.out.println("Your grade is A");
        }
        sc.close();
        
    }
}