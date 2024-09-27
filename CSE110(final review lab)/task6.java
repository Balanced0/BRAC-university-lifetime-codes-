//Strings
//Task 2
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S = ");
        String s = sc.nextLine();
        System.out.print("S1 = ");
        String s1 = sc.nextLine();
        System.out.print("S2 = ");
        String s2 = sc.nextLine();
        
        modifyStrings(s, s1, s2);
    }
    
    public static void modifyStrings(String s, String s1, String s2) {
        String fs = "";  // Temporary string to build up potential matches for s1
        String ffs = ""; // Final result string
        int matchIndex = 0; // Track index for matching s1 characters

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (a == s1.charAt(matchIndex)) {
                // Build up fs while characters match s1
                fs = fs + a;
                matchIndex++;
                
                // If a full match of s1 is found, replace it with s2
                if (fs.length() == s1.length()) {
                    ffs = ffs + s2;
                    fs = "";  // Reset fs for future matches
                    matchIndex = 0; // Reset matchIndex
                }
            } else {
                // Append the non-matching portion (fs) to the result
                ffs = ffs + fs + a;
                fs = "";  // Reset fs since there's no match
                matchIndex = 0; // Reset matchIndex
            }
        }
        
        // In case fs contains some remaining unmatched characters, add them
        ffs = ffs + fs;

        System.out.println(ffs); // Print the final modified string
    }
}
