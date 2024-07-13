import java.util.Scanner;
public class powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * c;
        int i = 1;
        int product = 1;
        while(i <= d){
            product = product * a;
            i++;
        }
        System.out.println(product);
    }
}