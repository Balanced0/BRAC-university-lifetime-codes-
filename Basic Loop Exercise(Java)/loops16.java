import java.util.Scanner;
public class loops16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        double sum  = 0;
        while(i <= n){
            sum = sum + (Math.pow(-1, i)* (1.0/i));
            i++;
        }
        System.out.println(sum);
    }
}