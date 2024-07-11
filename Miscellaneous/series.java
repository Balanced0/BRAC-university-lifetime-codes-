//OUTPUT: 3, 45, 9, 38, 27, 31, 81, 24, 243, 17
public class series{
    public static void main(String[] args){
        int square_base = 3;
        int normal_term  = 45;
        int i = 1;
        int product = 3;
        int count = 1;
        while(square_base <= 243 && normal_term >= 17){
            System.out.print(square_base);
            if(count < 6){
                System.out.print(", ");
            }
            System.out.print(normal_term);
            if(count < 5){
                System.out.print(", ");
            }
            square_base = square_base * product;
            normal_term = normal_term - 7;
            count++;
        }
    }
}