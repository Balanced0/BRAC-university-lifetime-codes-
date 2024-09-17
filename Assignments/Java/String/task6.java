import java.util.Scanner;
public class task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String fs = "";
        String ffs = "";
        for(int i = s.length() - 1; i >= 0; i--){
            int j = s.codePointAt(i);
            fs = fs + (char) j;
            if(j == 32){
                for(int k = fs.length() - 1; k >= 0; k--){
                    int l = fs.codePointAt(k);
                    if(l == 32){
                        l = l - 32;
                    }
                    ffs = ffs + (char) l;
              
                }
                ffs = ffs + " ";
                fs = "";
            }
        }
        for(int k = fs.length() - 1; k >= 0; k--){
            int l = fs.codePointAt(k);
            ffs = ffs + (char) l;
        }
        System.out.println(ffs);
    }
}