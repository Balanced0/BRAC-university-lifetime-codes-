public class Task10 {
    public static void main(String[] args) {
        //Task 11
        double a  = 4.5;
        double b = 9.5;
        double c = Math.sqrt((a*a) + (b*b));
        double sinA  = a/c;
        double cosA = b/c;
        double sinB = b/c;
        double cosB = a/c;
        System.out.println(sinA);
        System.out.println(cosA);
        System.out.println(sinB);
        System.out.println(cosB);
    }
}