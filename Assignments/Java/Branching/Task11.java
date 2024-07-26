import java.util.Scanner;
public class Task11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a != b && a != c && b != c){
            System.out.println("This is a Scalene triangle");
        }
        else if(a == b && a == c && b == c){
            System.out.println("This is a Equilateral triangle");
        }else{
            System.out.println("This is a Isosceles triangle");
        }
        sc.close();
    }
}