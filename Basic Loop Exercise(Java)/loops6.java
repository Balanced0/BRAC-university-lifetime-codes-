import java.util.Scanner;
public class loops6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true){
            int b = a%10;
            System.out.print(b);
            a = a/10;
            if(a == 0){
                break;
            }
        }
    }
}