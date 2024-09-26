import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double area = circleArea(n);
        System.out.printf("%.4f%n", area);
        double volume = sphereVolume(n);
        System.out.printf("%.4f%n", volume);

    }
    
    public static double circleArea(int r){
        double a = 3.1416 * r * r;
        return a;
    }
    
    public static double sphereVolume(int r){
        double v = (4.0/3) * 3.1416 * r * r * r;
        return v;
    }
}