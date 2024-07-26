import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b){
            if (a > c){
                System.out.println("Largest Number: " + a);
            }else{
                System.out.println("Largest Number: " + c);
            }
        }else{
            System.out.println("Largest Number: " + b);
        }
        sc.close();
    }
}