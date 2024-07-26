import java.util.Scanner;
public class Task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms:");
        int nof = sc.nextInt();
        int i = 0;
        int sum = 0;
        int odd = 1;
        System.out.println("The odd numbers are:");
        while(i < nof){
            if (odd%2 != 0){
                System.out.println(odd);
                sum = sum + odd;
                i++;
            }
            odd++;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + nof + " terms is: " + sum);
        
        sc.close();
    }
}