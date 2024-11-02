import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String fs = "";
        String ffs = "";
        String tempWord = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                for(int j = fs.length() - 1; j >= 0; j--) {
                    char ch = fs.charAt(j);
                    ffs = ffs + ch;
                }
                ffs = ffs + " ";
                fs = ""; // Reset fs after processing each word
            } else {
                fs = fs + c; // Collect characters in reverse order
            }
        }
        
        // Reverse and add the last word
        for(int j = fs.length() - 1; j >= 0; j--) {
            char ch = fs.charAt(j);
            ffs = ffs + ch;
        }

        System.out.println(ffs.trim()); // Remove any trailing space
    }
}