import java.util.Scanner;
public class task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count  = 0;
        int charcounter = 0;
        int upper = 0;
        int lower = 0;
        int spc = 0;
        for(int i = 0; i < s.length(); i++){
            count++;
            int j = s.codePointAt(i);
            if((j >= 65 && j <= 90) || (j >= 97 && j <= 122)){
                charcounter++;
            }
            if(j >= 65 && j <= 90){
                upper++;
            }
            if(j >= 97 && j <= 122){
                lower++;
            }
            if((j >= 33 && j <= 47) || (j >= 58 && j <= 64) || (j >= 91 && j <= 96) || (j >= 123 && j <= 126)){
                spc++;
            }
            
        }
        
        
        
        
        if(count >= 8){
            if(charcounter >= 1){
                if(upper >= 1){
                    if(lower >= 1){
                        if(spc >= 1){
                            System.out.println("True");
                        }
                        else{
                            System.out.println("False");
                        }
                    }
                    else{
                        System.out.println("False");
                    }
                }
                else{
                    System.out.println("False");
                }
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
    }
}