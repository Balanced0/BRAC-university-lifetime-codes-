import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double area = circleArea(n);
        System.out.printf("%.4f%n", area);
    }
    
    public static double circleArea(int r){
        double a = 3.1416 * r * r;
        return a;
    }
}