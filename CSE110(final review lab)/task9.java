//Strings + Methods
//Task 5
import java.util.Scanner;
public class task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int decimal = toDecimal(s);
        System.out.println(decimal);
        String hex = toHex(decimal);
        System.out.println(hex);       
    }
    
    public static int toDecimal(String s){
        int sum = 0;
        int j = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int num = 0;
            int a = s.charAt(i);
            if(a == 49){
                num = a - 48;
            }
            else if(a == 48){
                num = a - 48;
            }
            sum = sum + (num * (int)Math.pow(2, j));
            j++;          
        }
        return sum;
    }
    
    public static String toHex(int n){
        String fs = "";
        String ffs = "";
        while(n > 0){
            int a = n%16;
            if(a == 10){
                fs = fs + "A";
            }
            else if(a == 11){
                fs = fs + "B";
            }
            else if(a == 12){
                fs = fs + "C";
            }
            else if(a == 13){
                fs = fs + "D";
            }
            else if(a == 14){
                fs = fs + "E";
            }
            else if(a == 15){
                fs = fs + "F";
            }
            else if(a < 10){
                fs = fs + a;
            }
            n = n / 16;
        }
        for(int i = fs.length() - 1; i >= 0; i--){
            ffs = ffs + fs.charAt(i);
        }
        return ffs;
    }
}