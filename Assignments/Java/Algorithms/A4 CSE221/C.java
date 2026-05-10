import java.util.*;
import java.io.*;
public class C {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        //number of vertices
        int n = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][n];
        for(int l = 0; l < n; l++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int[] temp = new int[k];
            for(int i = 0; i < k; i++){
                temp[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 0; i < temp.length; i++){
                mat[l][temp[i]] = 1;
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                pw.print(mat[i][j] + " ");
            }
            pw.println();
        }
        pw.flush();
    }
}
