import java.util.Scanner;
public class Task13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int a = sc.nextInt();
        System.out.println("Input the 2nd number:");
        int b = sc.nextInt();
        System.out.println("Input the 3rd number:");
        int c = sc.nextInt();
        if (a == b && a == c && b == c){
            System.out.println("All numbers are equal");
        }
        else if(a != b && a != c && b != c){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
        sc.close();
    }
}