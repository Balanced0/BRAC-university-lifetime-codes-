import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            char a = s.charAt(i);
            rev = rev + a;
        }
        if(s.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }       
    }
}