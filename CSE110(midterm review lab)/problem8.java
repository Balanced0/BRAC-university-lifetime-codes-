import java.util.Scanner;
public class problem8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 1){
            if(n % 2 == 0){
                System.out.print(n);
                n = n/2;
            }
            else if(n % 2 != 0){
                System.out.print(n);
                n = (n * 3) + 1;
            }
            System.out.print(", ");
            if(n == 1){
                System.out.print(n);
            }
        }
    }
}