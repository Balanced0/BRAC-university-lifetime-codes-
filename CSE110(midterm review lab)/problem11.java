import java.util.Scanner;
public class problem11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min, max;
        min = max = n;
        int i = 2;
        int sum = 0;
        int count = 0;
        while(i <= 5){
            n = sc.nextInt();
            if(n < min){
                min = n;
            }
            else if(n > max){
                max = n;
            }
            if(n%2 == 0){
                sum = sum + n;
                count++;
            }
            i++;
        }
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + (average));
    }
}