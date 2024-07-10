import java.util.Scanner;
public class loops19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int i = 0;
        double sum  = 0;
        while(i < n){
            sum  = sum + (Math.pow(-1, (i + 1)) * ((Math.pow(x, ((2 * i) -1))))/factorial(((2 * i) - 1)));
            i++;
        }
        System.out.println(sum);
    }
}