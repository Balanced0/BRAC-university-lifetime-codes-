import java.util.Scanner;
public class problem10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(n > 0){
            int a  =  n%10;
            n /= 10;
            sum = sum + (a * (int)Math.pow(2, i));
            i++;
        }
        System.out.println(sum);
    }
}