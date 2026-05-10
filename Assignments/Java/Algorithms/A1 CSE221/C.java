import java.util.*;
public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long n = sc.nextLong();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }
}
