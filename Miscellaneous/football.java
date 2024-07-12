import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int win = 3;
        int draw = 1;
        int loss = 0;
        int game_won = 0;
        int game_lost = 0;
        int game_draw = 0;
        int points = 0;
        while(i <= n){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                points = points + win;
                game_won++;
            }
            else if(a == b){
                points = points + draw;
                game_draw++;
            }
            else{
                points = points + loss;
                loss++;
            }
            i++;
        }
        System.out.println("Total points: " + points);
        double winning_percentage = ((double)game_won / n)*100.0;
        System.out.printf("Winning percentage: %.2f", winning_percentage);
        System.out.print("%");
    }
}
