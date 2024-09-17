import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String fs = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int j = s.codePointAt(i);
            if(count%2 != 0){
                if(j >= 97 && j <= 122){
                    j = j - 32;
                    fs = fs  + (char) j;
                }
                else{
                    fs = fs  + (char) j;
                }
            }
            else{
                if(j >= 65 && j <= 90){
                    j = j + 32;
                    fs = fs  + (char) j;
                }
                else{
                    fs = fs  + (char) j;
                }
            }
            
            if((j >= 97 && j <= 122) || (j >= 65 && j <= 90)){
                count++;
            }
        }
        System.out.println(fs);
    }
}