import java.util.*;
import java.io.*;
public class C {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        String b_binary = Long.toBinaryString(b);
        long ans = a;
        for(int i = 0; i < b_binary.length() - 1; i++){
            if(b_binary.charAt(i + 1) == '0'){
                ans = (ans*ans)%107;
            }
            else if(b_binary.charAt(i + 1) == '1'){
                ans = (ans*ans)%107;
                ans = (ans*a)%107;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}
