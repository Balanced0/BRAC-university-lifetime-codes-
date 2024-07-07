import java.util.Scanner;
public class loops3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int a = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int multiply = a * i;
            System.out.println(a + " x " + i + " = " + multiply);
        }
    } 
}