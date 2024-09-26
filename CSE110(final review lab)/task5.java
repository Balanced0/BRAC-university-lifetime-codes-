import java.util.Scanner;
public class task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int salary = sc.nextInt();
        double t = calcTax(age, salary);
        System.out.printf("%.1f%n", t);
    }
    
    public static double calcTax(int age, int salary){
        if(age < 18){
            return 0.0;
        }
        else{
            if(salary < 10000){
                return 0.0;
            }
            else{
                if(salary >= 10000 && salary <= 20000){
                    return (7.0/100)*salary;
                }
                else if(salary > 20000){
                    return (14.0/100)*salary;
                }
            }
        }
        return 0.0;
    }
}