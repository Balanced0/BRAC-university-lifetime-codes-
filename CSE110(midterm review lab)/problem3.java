import java.util.Scanner;
public class problem3{
    public static void main(String[] args){
        //Read the four integer values corresponding to the x and y axes of two points, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them. Also, show whether the slope created from this line is positive or negative or zero.
       Scanner sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double distance  = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
       double slope = (y2 - y1)/(x2 - x1);
       System.out.printf("Distance: %.4f\n", distance);
       System.out.printf("Slope: %.4f\n", slope);
       if(slope > 0){
           System.out.println("The slope is Positive");
       }
       else{
           System.out.println("The slope is Negative");
       }
    }
}