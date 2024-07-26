public class Task5{
    public static void main(String[] args){
        //a) By creating a third variable 
        int a = 5;
        int b = 8;
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println("a is "+ a + " b is "+ b);
        
        //b) Without creating any other variables
        int a1 = 7;
        int b1 = 9;
        a1 = a1 + 2;
        b1 = b1 - 2;
        System.out.println("a is "+ a1 + " b is "+ b1);

    }
}
