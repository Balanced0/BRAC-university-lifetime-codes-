public class problem1{
    public static void main(String[] args){
        //Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).
        int distance = 500;
        double litre = 35.0;
        double result = distance/litre;
        System.out.printf("%.3f km/l", result);
    }
}