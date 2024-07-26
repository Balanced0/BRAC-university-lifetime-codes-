import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int original = n;
        while(n != 0){
            n = n/10;
            i++;    
        }
        double div = Math.pow(10, (i - 1));
        int division = (int)div;
        n = original;
        while(division > 0){
            int first_step = n/division;
            n = n%division;
            division = division/10;
            System.out.print(first_step);
            if (division > 0) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}