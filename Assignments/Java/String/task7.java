import java.util.Scanner;
public class task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String fs = "";
        for(int i = 0; i < s1.length(); i++){  
            boolean caught = false;
            for(int j = 0; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    caught = true;
                }
            }
            if(caught == false){
                int k = s1.codePointAt(i);
                k = k - 32;
                fs = fs + (char) k;
            }
            
        }
        for(int i = 0; i < s2.length(); i++){  
            boolean caught = false;
            for(int j = 0; j < s1.length(); j++){
                if(s2.charAt(i) == s1.charAt(j)){
                    caught = true;
                }
            }
            if(caught == false){
                int k = s2.codePointAt(i);
                k = k - 32;
                fs = fs + (char) k;
            }
            
        }
        System.out.println(fs);
    }
}
    