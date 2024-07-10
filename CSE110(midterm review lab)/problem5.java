import java.util.Scanner;
public class problem5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first_value = sc.nextInt();
        int change  = sc.nextInt();
        int last_value = sc.nextInt();
        int i = first_value;
        while(i < last_value){
            System.out.print(first_value);
            first_value = first_value + change;
            i = i + change;
            if(i < last_value){
                System.out.print(", ");
            }
        }
    }
}