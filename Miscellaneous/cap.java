//This is Java. Programming is fun! Hey do you like programming?
public class cap{
    public static void main(String[] args){
        String s = "This is Java. programming is fun! hey do you like programming?";
        String fs = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i >= 3){
                char cb = s.charAt(i - 1);
                char cbb = s.charAt(i - 2);
                if((cbb >= '!' && cbb <= '/') || (cbb >= ':' && cbb <= '@')){
                    c = (char) (c - 32);
                    fs = fs + c;
                }
                else{
                    fs = fs + c;
                }
            }
            else{
                fs = fs + c;
            }
            
            
        }
        System.out.println(fs);
    }
}