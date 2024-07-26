public class Task2{
    public static void main(String[] args){
        int a = -10;
        while ( a < 25 ){
            System.out.println(a);
            a += 5;
            if ( a > 20 ){
                break;
            }
        }
    }
}