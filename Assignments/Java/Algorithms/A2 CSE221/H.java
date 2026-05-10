import java.io.*;
import java.util.*;
public class H {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long left_pointer = 0;
            long right_pointer = k*2;
            while(left_pointer < right_pointer){
                long mid = (left_pointer + right_pointer)/2;
                long no_of_elements = mid - (mid/x);
                if(no_of_elements >= k){
                    right_pointer = mid;
                }
                else{
                    left_pointer = mid + 1;
                }
            }
            pw.println(left_pointer);
        }
        pw.flush();
    }
}   

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            long k = sc.nextLong();
            long x = sc.nextLong();
            
            long ans = k + (k - 1) / (x - 1);
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
*/
