import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char h = '-';
        char c = ',';
        for(int i = 0; i < s.length(); i++){
            if(h == s.charAt(i) || c == s.charAt(i)){
                System.out.println();
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}