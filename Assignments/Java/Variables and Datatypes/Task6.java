public class Task6{
    public static void main(String[] args){
        int mins  = 3456789;
        int years = (mins/525600);
        int day = (mins/1440);
        int total_day = 365 * 6;
        int actual_day = day - total_day;
        System.out.println(mins + " minutes is approximately " + years + " years and " + actual_day + " days");
    }
}