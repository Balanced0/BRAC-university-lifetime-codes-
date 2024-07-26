public class Task13 {
    public static void main(String[] args){
         //Task 14
        int a = 8;
        int b = 3;
        int c = a/2;
        double d = Math.sqrt((c*c) + (b*b));
        double area = ((3 * Math.sqrt(3)/ 2)*d*d);
        double circumference = 6 * d;
        System.out.println(area);
        System.out.println(circumference);
    }
}