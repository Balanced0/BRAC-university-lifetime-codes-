import java.util.Scanner;
public class problem6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double y = 0.0;
        int i = 1;
        while(i <= n){
            if(i%4 == 0){
                y = y - (1.0/i);
            }else{
                y = y + (1.0/i);
            }
            i++;
        }
        System.out.printf("Y = %.4f", y);
    }
}