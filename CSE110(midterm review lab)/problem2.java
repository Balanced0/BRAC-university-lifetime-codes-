import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
       //sing the following table, write a program that reads a code and the amount of an item. After, print the value to pay. This is a very simple program with the only intention of practicing selection commands.
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       double hot_dog = 4.0;
       double x_salad = 4.50;
       double x_bacon = 5.0;
       double toast = 2.0;
       double soda = 1.50;
       if(a == 1){
           System.out.println("Item: Hot Dog");
           System.out.println("Quantity: " + b);
           System.out.println("Total: $ " + (hot_dog * b));        
       }
       else if(a == 2){
           System.out.println("Item: X-Salad");
           System.out.println("Quantity: " + b);
           System.out.println("Total: $ " + (x_salad * b));        
       }
       else if(a == 3){
           System.out.println("Item: X-Bacon");
           System.out.println("Quantity: " + b);
           System.out.println("Total: $ " + (x_bacon * b));        
       }
       else if(a == 4){
           System.out.println("Item: Toast");
           System.out.println("Quantity: " + b);
           System.out.println("Total: $ " + (toast * b));        
       }
       else if(a == 5){
           System.out.println("Item: Soda");
           System.out.println("Quantity: " + b);
           System.out.println("Total: $ " + (soda * b));        
       }
    }
}