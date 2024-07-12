import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max, min;
        max = min = n;
        int count = 0;
        while(n != 0){
            if(n%2 == 0 && n > 0){
                sum = sum + n;
                count++;
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
                
            }
            n = sc.nextInt();
        }
        if(count == 0){
            sum = 0;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}
