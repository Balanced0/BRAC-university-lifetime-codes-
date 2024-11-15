import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int sum = 0;
        for(int i = 0; i < s3.length(); i++){
            int c = s3.charAt(i);
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                sum = sum + c;
            }
        }
        System.out.println(sum);
    }
}