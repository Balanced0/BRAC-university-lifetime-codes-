import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp_a = a;
        int b = sc.nextInt();
        int temp_b = b;
        int sum = 0;
        while(a <= b){
            int count = 0;
            for(int i = 1; i <= a; i++){
                if(a%i == 0){
                    count++;
                }
            }
            if(count == 2){
                sum = sum + 1;
            }
            a++;
        }
        while(b <= a){
            int count = 0;
            for(int i = 1; i <= b; i++){
                if(b%i == 0){
                    count++;
                }
            }
            if(count == 2){
                sum = sum + 1;
            }
            b++;
        }
        if(temp_a > temp_b){
            System.out.println("There are " + sum + " prime numbers between " + temp_b + " and " + temp_a);
        }
        else{
            System.out.println("There are " + sum + " prime numbers between " + temp_a + " and " + temp_b);
        }
        
    }
}