import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String fs = "";
        for(int i = 0; i < s.length(); i++){
            int a = s.codePointAt(i);
            if(a >=  97 && a <= 122){
                a = a - 32;
            }
            char c = (char) a;
            fs = fs + c;
        }
        System.out.println(fs);
    }
}