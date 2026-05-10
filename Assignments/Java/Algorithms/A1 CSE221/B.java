import java.util.*;
public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            String new_s = s.replace("calculate ", "");
            String[] numbers = new_s.split("[+-/*]");
            if(new_s.contains("+")){
                System.out.println(Float.parseFloat(numbers[0]) + Float.parseFloat(numbers[1]));
            }
            else if(new_s.contains("-")){
                System.out.println(Float.parseFloat(numbers[0]) - Float.parseFloat(numbers[1]));
            }
            else if(new_s.contains("/")){
                System.out.println(Float.parseFloat(numbers[0]) / Float.parseFloat(numbers[1]));
            }
            else if(new_s.contains("*")){
                System.out.println(Float.parseFloat(numbers[0]) * Float.parseFloat(numbers[1]));
            }
        }
    }
}
