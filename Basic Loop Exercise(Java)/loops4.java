import java.util.Scanner;
public class loops4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int a = sc.nextInt();
        int multiply  = 1;
        while(true){
            multiply  = multiply * a;
            a--;
            if(a == 0){
                break;
            }
        }
        System.out.println(multiply);
    } 
}