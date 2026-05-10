import java.util.*;
import java.io.*;
public class F {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int x1 = x-1;
        int y1 = y;
        int x2 = x-1;
        int y2 = y+1;
        int x3 = x;
        int y3 = y+1;
        int x4 = x+1;
        int y4 = y+1;
        int x5 = x+1;
        int y5 = y;
        int x6 = x+1;
        int y6 = y-1;
        int x7 = x;
        int y7 = y-1;
        int x8 = x-1;
        int y8 = y-1;
        int counter = 0;
        if(x1 > 0){
            counter++;
        }
        if(x2 > 0 && y2 <= n){
            counter++;
        }
        if(y3 <= n){
            counter++;
        }
        if(x4 <= n && y4 <= n){
            counter++;
        }
        if(x5 <= n){
            counter++;
        }
        if(x6 <= n && y6 > 0){
            counter++;
        }
        if(y7 > 0){
            counter++;
        }
        if(x8 > 0 && y8 > 0){
            counter++;
        }
        pw.println(counter);
        // for this question I found the ascending sequence to be 8 < 1 < 2 < 7 < 3 < 6 < 5 < 4
        if(x8 > 0 && y8 > 0){
            pw.println(x8 + " " + y8);
        }
        if(x1 > 0){
            pw.println(x1 + " " + y1);
        }
        if(x2 > 0 && y2 <= n){
            pw.println(x2 + " " + y2);
        }
        if(y7 > 0){
            pw.println(x7 + " " + y7);
        }
        if(y3 <= n){
            pw.println(x3 + " " + y3);
        }
        if(x6 <= n && y6 > 0){
            pw.println(x6 + " " + y6);
        }
        if(x5 <= n){
            pw.println(x5 + " " + y5);
        }
        if(x4 <= n && y4 <= n){
            pw.println(x4 + " " + y4);
        }
        pw.flush();
    }
}
