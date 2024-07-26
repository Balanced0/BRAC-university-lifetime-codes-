import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Maximum number is " + a);
                System.out.println("Minimum number is " + c);
            } else {
                System.out.println("Maximum number is " + a);
                System.out.println("Minimum number is " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Maximum number is " + b);
                System.out.println("Minimum number is " + c);
            } else {
                System.out.println("Maximum number is " + b);
                System.out.println("Minimum number is " + a);
            }
        } else if (c >= a && c >= b) {
            if (a >= b) {
                System.out.println("Maximum number is " + c);
                System.out.println("Minimum number is " + b);
            } else {
                System.out.println("Maximum number is " + c);
                System.out.println("Minimum number is " + a);
            }
        }

        sc.close();
    }
}