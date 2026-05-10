import java.util.*;
import java.io.*;
public class D {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0; i < t; i++){
            long[][] matrix = new long[2][2];
            st = new StringTokenizer(br.readLine());
            matrix[0][0] = Long.parseLong(st.nextToken());
            matrix[0][1] = Long.parseLong(st.nextToken());
            matrix[1][0] = Long.parseLong(st.nextToken());
            matrix[1][1] = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long[][] ans = {{1, 0},{0, 1}};
            while(x != 0){
                if(x%2 != 0){
                    ans = matrixMultiply(matrix, ans);
                }
                matrix = matrixMultiply(matrix, matrix);
                x = x/2;
            }
            pw.println(ans[0][0] + " " + ans[0][1]);
            pw.println(ans[1][0] + " " + ans[1][1]);
        }
        pw.flush();
    }
    static long[][] matrixMultiply(long[][] matA, long[][] matB){
        long[][] mat = new long[2][2];
        long mod = 1000000007;
        mat[0][0] = ((matA[0][0] * matB[0][0]) + (matA[0][1] * matB[1][0]))%mod;
        mat[0][1] = ((matA[0][0] * matB[0][1]) + (matA[0][1] * matB[1][1]))%mod;
        mat[1][0] = ((matA[1][0] * matB[0][0]) + (matA[1][1] * matB[1][0]))%mod;
        mat[1][1] = ((matA[1][0] * matB[0][1]) + (matA[1][1] * matB[1][1]))%mod;
        return mat;
    }
}
