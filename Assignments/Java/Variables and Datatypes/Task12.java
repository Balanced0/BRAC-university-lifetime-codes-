public class Task12 {
    public static void main(String[] args) {
        //Task 13
        int distance = 2500;
        int s1 = 5 * 3600;
        int s2 = 56 * 60;
        int seconds = s1 + s2 + 23;
        double v = ((double)distance / seconds);
        double vkmh = v * 3.6;
        double mile = ((double)distance / 1609);
        double hours = ((double)seconds / 3600);
        double mh = mile / hours;
        System.out.println("Your velocity in km/h is " + vkmh);
        System.out.println("Your velocity in miles/h is " + mh);
    }
}