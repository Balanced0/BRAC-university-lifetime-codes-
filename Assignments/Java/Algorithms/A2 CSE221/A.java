import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int l = 0;
        int r = arr.length - 1;
        int[] ans = new int[2];
        boolean found = false;
        while (l < r) {
            long temp = arr[l] + arr[r];
            if (temp == s) {
                ans[0] = l;
                ans[1] = r;
                found = true;
                break;
            } else if (temp < s) {
                l++;
            } else {
                r--;
            }
        }
        if (found) {
            pw.println((ans[0] + 1) + " " + (ans[1] + 1));
        } else {
            pw.println(-1);
        }
        pw.flush();
    }
}
