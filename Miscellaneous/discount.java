import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  i = 1;
        int sum = 0;
        int discount_terms = 0;
        double new_sum = 0.0;
        while(i <= n){
            int a = sc.nextInt();
            sum = sum + a;
            if(a%2 == 0){
               discount_terms = discount_terms + a;
            }
            i++;
        }
        new_sum = sum - (discount_terms * 0.05);
        System.out.println("Price before discount: " + sum);
        System.out.println("Price after discount: " + new_sum);
    }
}