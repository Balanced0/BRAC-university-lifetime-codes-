import java.util.*;
import java.io.*;
public class F {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        long[] ans = new long[n];
        specialBST(arr, 0, arr.length - 1, ans);
        for(int i = 0; i < ans.length; i++){
            pw.print(ans[i] + " ");
        }
        pw.println();
        pw.flush();
    }
    public static int counter = 0;
    public static void specialBST(long[] arr, int left, int right, long[] ans){
        if(left > right){
            return;
        }
        int mid = (left+right)/2;
        ans[counter++] = arr[mid];
        specialBST(arr, left, mid - 1, ans);
        specialBST(arr, mid + 1, right, ans);
    }
}