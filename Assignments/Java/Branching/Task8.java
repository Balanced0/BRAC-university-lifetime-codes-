import java.util.Scanner;
public class Task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        int year = id / 1000000;
        int a = id / 100000;
        int session = a%10;
        if (session == 1){
            System.out.println("Student Joined BRAC in Spring " + year);
        }
        else if (session == 2){
            System.out.println("Student Joined BRAC in Fall " + year);
        }else{
            System.out.println("Student Joined BRAC in Summer " + year);
        }    
        sc.close();
    }
}