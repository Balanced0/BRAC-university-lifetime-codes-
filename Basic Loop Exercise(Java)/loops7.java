import java.util.Scanner;
public class loops7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum_odd = 0;
        int sum_even = 0;
        int i = 1;
        while(i <= a){
            if(i%2 == 0){
                sum_even = sum_even + i;
            }
            else if(i%3 == 0){
               sum_odd = sum_odd + i;
            }
            i++; 
        }
        System.out.println("Sum of odd numbers: " + sum_odd); 
        System.out.println("Sum of even numbers: " + sum_even);
    }
}
