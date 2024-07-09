import java.util.Scanner;
public class loops12{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int min_a = Integer.MAX_VALUE;
        int max_a = Integer.MIN_VALUE;
        boolean firstIteration = true;
        while(true){
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(firstIteration){
                min_a = a;
                max_a = a;
                firstIteration = false;
            }else{
                if(a > max_a){
                    max_a = a;
                }
                if(a < min_a){
                    min_a = a;
                }
            }
            
            //ASK
            System.out.println("Do you want to continue? y / n");
            String answer = sc.next();
            if(answer.equals("n")){
                break;
            }else{
                continue;
            }
        }
        System.out.println("max: " + max_a);
        System.out.println("min: " + min_a);
    }
}