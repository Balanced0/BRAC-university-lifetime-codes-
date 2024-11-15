import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 999;
        int sum = 0;
        int count = 0;
        int no_odd_counter = 0;
        for(int i = 0; i < 10; i++){
            int a = arr[i];
            if(a > 0 && a%2 != 0){
                sum = sum + a;
                if(a > max){
                    max = a;
                }
                if(a < min){
                    min = a;
                }
                count++;
            }
            if(a > 0 && a%2 != 0){
                no_odd_counter++;
            }
        }
        if(no_odd_counter == 0){
            System.out.println("No odd positive numbers found");
        }
        else if(no_odd_counter > 0){
            double average = sum/(double) count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + average);
        }
        
    }
}