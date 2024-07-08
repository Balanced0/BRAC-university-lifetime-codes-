import java.util.Scanner;
public class loops11{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        while(true){
            System.out.println("Enter Number");
            int a = sc.nextInt();
            if(a > 0){
                positive++;
            }
            else if(a < 0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Do you want to continue? y / n");
            String answer = sc.next();
            if(answer.equals("n")){
                break;
            }else{
                continue;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}