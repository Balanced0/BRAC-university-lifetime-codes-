import java.util.*;
import java.io.*;
public class G {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[][] table = new boolean[n][m];
        Pair[] temp = new Pair[k];
        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            table[x - 1][y-1] = true;
            temp[i] = new Pair(x, y);
        }
        boolean found = false;
        for(int i = 0; i < k; i++){
            int x = temp[i].x;
            int y = temp[i].y;
            int x1 = x-2;
            int y1 = y-1;
            int x2 = x-2;
            int y2 = y+1;
            int x3 = x-1;
            int y3 = y-2;
            int x4 = x-1;
            int y4 = y+2;
            int x5 = x+1;
            int y5 = y-2;
            int x6 = x+1;
            int y6 = y+2;
            int x7 = x+2;
            int y7 = y-1;
            int x8 = x+2;
            int y8 = y+1;
            if(x1 >= 1 && x1 <= n && y1 >= 1 && y1 <= m && table[x1 - 1][y1 - 1] == true){
                found = true;
                break;
            }
            if(x2 >= 1 && x2 <= n && y2 >= 1 && y2 <= m && table[x2 - 1][y2 - 1] == true){
                found = true;
                break;
            }
            if(x3 >= 1 && x3 <= n && y3 >= 1 && y3 <= m && table[x3 - 1][y3 - 1] == true){
                found = true;
                break;
            }
            if(x4 >= 1 && x4 <= n && y4 >= 1 && y4 <= m && table[x4 - 1][y4 - 1] == true){
                found = true;
                break;
            }
            if(x5 >= 1 && x5 <= n && y5 >= 1 && y5 <= m && table[x5 - 1][y5 - 1] == true){
                found = true;
                break;
            }
            if(x6 >= 1 && x6 <= n && y6 >= 1 && y6 <= m && table[x6 - 1][y6 - 1] == true){
                found = true;
                break;
            }
            if(x7 >= 1 && x7 <= n && y7 >= 1 && y7 <= m && table[x7 - 1][y7 - 1] == true){
                found = true;
                break;
            }
            if(x8 >= 1 && x8 <= n && y8 >= 1 && y8 <= m && table[x8 - 1][y8 - 1] == true){
                found = true;
                break;
            }
        }
        if(found){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }
        pw.flush();
    }
    static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
