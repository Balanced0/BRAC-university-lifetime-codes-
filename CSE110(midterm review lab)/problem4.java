import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        // Check if A is zero
        if (A == 0) {
            System.out.println("Impossible to calculate");
        } else {
            // Calculate the discriminant
            double discriminant = B * B - 4 * A * C;
            
            // Check if roots are real
            if (discriminant >= 0) {
                // Calculate roots
                double sqrtDiscriminant = Math.sqrt(discriminant);
                double x1 = (-B + sqrtDiscriminant) / (2 * A);
                double x2 = (-B - sqrtDiscriminant) / (2 * A);
                
                // Output roots
                System.out.printf("Root#1 = %.5f\n", x1);
                System.out.printf("Root#2 = %.5f\n", x2);
            } else {
                // If discriminant is negative, roots are complex
                System.out.println("Impossible to calculate");
            }
        }
    }
}
