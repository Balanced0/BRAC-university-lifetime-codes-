import java.util.Scanner;
public class loops9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int hcf = 1;
        if(a > b){
           do{
                if(a%i == 0 && b%i == 0){
                    hcf = i;
                }
                i++;
            } while(i <= a);
            System.out.println(hcf);
        }else{
            do{
                if(a%i == 0 && b%i == 0){
                    hcf = i;
                }
                i++;
            }while(i <= b);
            System.out.println(hcf);
        }
    }
}