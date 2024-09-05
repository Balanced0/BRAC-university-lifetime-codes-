import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= i; j++){
                sum = sum + j;
            }
        }
        System.out.println("The value of y: -" + sum);
    }
}