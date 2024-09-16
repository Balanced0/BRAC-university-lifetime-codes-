import java.util.Scanner;
public class task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v = 0;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
              || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
              ){
                v++;
            }
            else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                c++;
            }
        }
        if(v > 0 && c > 0){
            if(v%3 == 0 && c%5 == 0){
                System.out.println("Aaarr! Me Plunder!!");
            }
            else{
                System.out.println("Blimey! No Plunder!!");
            }
        }
        else{
            System.out.println("Blimey! No Plunder!!");
        }
    }
}