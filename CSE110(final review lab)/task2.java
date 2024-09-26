import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double area = circleArea(n);
        System.out.printf("%.4f%n", area);
        double volume = sphereVolume(n);
        System.out.printf("%.4f%n", volume);
        findSpace(n, "sphere");

    }
    
    public static double circleArea(int r){
        double a = 3.1416 * r * r;
        return a;
    }
    
    public static double sphereVolume(int r){
        double v = (4.0/3) * 3.1416 * r * r * r;
        return v;
    }
    
    public static void findSpace(int d, String shape){
        int r  = d/2;
        if(shape.equals("circle")){
            double a = circleArea(r);
            System.out.printf("%.4f%n", a);
        }
        else if(shape.equals("sphere")){
            double a = sphereVolume(r);
            System.out.printf("%.4f%n", a);
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
}