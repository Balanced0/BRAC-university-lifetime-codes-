import java.util.Scanner;
public class loops5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        int a = sc.nextInt();
        System.out.println("Enter Power");
        int b = sc.nextInt();
        int i = 0;
        int multiply  = 1;
        while(i < b){
            multiply = multiply * a;
            i++;
        }
        System.out.println(multiply);
    } 
}