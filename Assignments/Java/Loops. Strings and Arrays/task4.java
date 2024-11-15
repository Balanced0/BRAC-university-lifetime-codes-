import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            int c = s.codePointAt(i); 
            if(c == 97){
                c = 122;
            }
            else{
                c = c - 1;
            }
            char a = (char) c;
            System.out.print(a);
        }
    }
}