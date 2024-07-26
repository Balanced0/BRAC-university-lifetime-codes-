import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int a = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int b = sc.nextInt();
        if(b > a){
            int change  = (b - a);
            if(change == 0){
                System.out.println("The returned amount is 0 taka");
            }else{
                System.out.println("The returned amount is " + change + " taka"); 
                //notes
                int notes100 = change / 100;
                int remaining1 = change % 100;
                int notes50 = remaining1 / 50;
                int remaining2 = remaining1 % 50;
                int notes20 = remaining2 / 20;
                int remaining3 = remaining2 % 20;
                int notes10 = remaining3 / 10;
                int remaining4 = remaining3 % 10;
                //coins
                int coins5 = remaining4 / 5;
                int remaining5 = remaining4 % 5;
                int coins2 = remaining5 / 2;
                int coins1 = remaining5 % 2;
                System.out.println("100 taka note: " + notes100);
                System.out.println("50 taka note: " + notes50);
                System.out.println("20 taka note: " + notes20);
                System.out.println("10 taka note: " + notes10);
                System.out.println("5 taka coin: " + coins5);
                System.out.println("2 taka coin: " + coins2);
                System.out.println("1 taka coin: " + coins1);
            }
        }
        else{
            System.out.println("Please pay " + (a - b) + " taka more");
        }
        sc.close();
    }
}