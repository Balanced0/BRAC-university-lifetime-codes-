import java.util.Scanner;
public class problem7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int y = 0;

        while(i <= n){
            y = y + (int)((Math.pow(-1, (i + 1))) * ((2*i) + 1));
            i++;
        }
        System.out.println(y);
    }
}