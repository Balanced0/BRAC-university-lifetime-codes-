import java.util.Scanner;
public class Task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        int i = 1;
        int positive = 0;
        int negative = 0;
        while(i <= a){
            System.out.println("Enter Number " + i + ": ");
            int n = sc.nextInt();
            i++;
            if(n < 0){
                negative++;
            }else{
                positive++;
            }
        }
        System.out.println(positive +" Non-negative Numbers");
        System.out.println(negative +" Negative Numbers");
        sc.close();
    }
}