import java.util.Scanner;
public class Task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(n != 0){
            n = n/10;
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}