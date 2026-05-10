import java.util.*;
import java.io.*;

public class E {
    public static long a;
    public static long m;
    public static long previousPower;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        for (int l = 0; l < t; l++) {
            st = new StringTokenizer(br.readLine());
            a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            m = Long.parseLong(st.nextToken());
            long sum = 0;
            if(n%2 == 0){
                sum = (getSumEven(n))%m;
            }
            else{
                sum = (getSumOdd(n))%m;
            }
            pw.println(sum);
        }
        pw.flush();
    }
    public static long getSumEven(long n){
        if(n == 2){
            previousPower = ((a%m) * (a%m))%m;
            return (a%m + previousPower)%m;
        }
        long half = 0;
        if((n/2)%2 == 0){
            half = getSumEven(n/2);
        }
        else{
            half = getSumOdd(n/2);
        }
        long halfPower = previousPower;
        previousPower = (halfPower * halfPower)%m;
        return (half * (1 + halfPower)%m)%m;
    }
    public static long getSumOdd(long n){
        if(n == 1){
            previousPower = a%m;
            return a%m;
        }
        long prev = getSumEven(n - 1);
        previousPower = (previousPower * (a%m))%m;
        return (prev + previousPower)%m;
    }
}


