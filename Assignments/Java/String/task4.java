import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            int a = s.codePointAt(i);
            char c = (char) a;
            rev = rev + c;
        }
        System.out.println(rev);
    }
}