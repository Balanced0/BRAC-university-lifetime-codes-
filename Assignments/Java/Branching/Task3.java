import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
 System.out.println("Enter Operator");
        String operator = sc.next();
        if (operator.equals("+")){
            System.out.println(a + b);
        }
        else if (operator.equals("-")){
            System.out.println(a - b);
        }
        else if (operator.equals("*")){
            System.out.println(a * b);
        }
        else if (operator.equals("/")){
            System.out.println(a / b);
        }
        sc.close();
    }
}