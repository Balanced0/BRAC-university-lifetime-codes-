import java.util.Scanner;
public class Task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int square;
        while(true){
            System.out.println("Enter Number: ");
            int a = sc.nextInt();
            if (a < 0){
                break;
            }
            square = a * a;
            System.out.println(a + " ^ 2 = " + square);
        }
        sc.close();
    }
}