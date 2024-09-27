//Arrays + Methods
//Task 10
import java.util.Scanner;
public class task11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = convertToCm(n);
        System.out.println(t + " cm");
        double [] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0, 18.0};
        double averageLength = findAvgCm(cheetos_inches);
        System.out.printf("The average Cheeto length is %.2f cm\n", averageLength);
    }
    
    public static double convertToCm(double n){
        double cm = 2.54 * n;
        return cm;
    }
    
    public static double findAvgCm(double [] cheetos_inches){
        double sum = 0.0;
        for(int i = 0; i < cheetos_inches.length; i++){
            double a = convertToCm(cheetos_inches[i]);
            sum = sum + a;
        }
        double avg = sum / (cheetos_inches.length);
        return avg;
    }
}