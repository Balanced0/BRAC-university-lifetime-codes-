import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 2;
        while(count < n){
            int loop = 1;
            int counter = 0;
            while(loop <= i){
                if(i%loop == 0){
                    counter++;
                }
                loop++;
            }
            if(counter == 2){
                System.out.println(i);
                count++;
            }  
            i++;
        }
    }
}