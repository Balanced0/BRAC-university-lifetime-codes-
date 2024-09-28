//Arrays + Strings + Methods
//Task 11
import java.util.Scanner;
public class task12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Number of vowels in the string: " + isVowel(s));
        System.out.println("Number of consonants in the string: " + isConsonant(s));
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        System.out.println( "The total number of vowels in the array is:" + vowelSum(names));
    }
    
    public static int isVowel(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
              || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
        }
        return count;
    }
    
    public static int isConsonant(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                          || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static int vowelSum(String [] names){
        int count = 0;
        for(int i = 0; i < names.length; i++){
            String fs = "";
            fs = fs + names[i];
            for(int j = 0; j < fs.length(); j++){
                char c = fs.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                   || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    count++;
                }
            }
        }
        return count;
    }
}