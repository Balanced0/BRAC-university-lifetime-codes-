import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int s = sc.nextInt();
        System.out.print("End: ");
        int n = sc.nextInt();
        
        System.out.println("Armstrong numbers:");
        for(int i = s; i<= n; i++){
            int orgi = i;
            int sum = 0;
            int temp = i;
            int count = 0;
            
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            
            temp = i;
            
            while(temp > 0){
                int a = temp%10;
                temp = temp/10;
                int b = (int)Math.pow(a, count);
                sum = sum + b;
            }
            if(orgi == sum){
                System.out.println(orgi);
            }
        }
    }
}