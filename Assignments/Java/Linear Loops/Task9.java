import java.util.Scanner;
public class Task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            if(i%5 == 0 && i%3 != 0){
                System.out.println(i);
            }
            i++;
        }
        
        sc.close();
    }
}