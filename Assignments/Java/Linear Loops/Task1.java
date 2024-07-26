public class Task1{
    public static void main(String[] args){
        int a = 24;
        while ( a < 25 ){
            System.out.println(a);
            a -= 6;
            if ( a < -6 ){
                break;
            }
        }
    }
}