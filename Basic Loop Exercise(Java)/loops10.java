import java.util.Scanner;
public class loops10{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int sum = 0;
        int new_sum = 0;
        do{
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();
            sum = a + b;
            new_sum += sum;
            System.out.println("Do you want to continue? y / n");
            String answer = sc.next();
            if(answer.equals("n")){
                break;
            }else{
                continue;
            }
        }while(true);
        System.out.println("Sum: " + new_sum);
    }
}