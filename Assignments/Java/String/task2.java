import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            int a = s.codePointAt(i);
            char c = (char) a;
            rev = rev + c;
        }
        if(s.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }       
    }
}