//OUTPUT: 3, 45, 9, 38, 27, 31, 81, 24, 243, 17
public class seriesb{
    public static void main(String[] args){
        int start1 = 3;
        int start2 = 45;
        for(int i = 1; i < 10; i++){
            if(i%2 != 0){
                System.out.print(start1 + ", ");
                start1 = start1 * 3;
            }
            else{
                System.out.print(start2 + ", ");
                start2 = start2 - 7;
            }
        }
        System.out.print(start2);
    }
}