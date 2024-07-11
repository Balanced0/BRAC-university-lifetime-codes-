import java.util.Scanner;
public class problem9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            int a  =  n%10;
            n /= 10;
            sum = sum + a;
        }
        if(sum % 2 == 0){
            System.out.println("The sum is even");
        }
        else{
            System.out.println("The sum is odd");
        }
    }
}