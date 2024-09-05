import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if(n%2 != 0){
                break;
            }
            int count = 0;
            for(int i = 1; i<=n; i++){
                if(n%i == 0){
                    count++;
                }
            }
            System.out.println(n + " has " + count + " divisors");
        }
    }
}