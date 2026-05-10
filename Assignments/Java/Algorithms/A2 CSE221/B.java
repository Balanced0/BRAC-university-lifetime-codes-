import java.io.*;
import java.util.*;
public class B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long[] arr1 = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = Long.parseLong(st.nextToken());
        }
        long[] arr2 = new long[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Long.parseLong(st.nextToken());
        }
        
        int i = 0;
        int j = m - 1;
        long min = Long.MAX_VALUE;
        long temp = 0;
        int[] ans = new int[2];
        while(i < n && j >= 0){
            long sum = arr1[i] + arr2[j];
            long diff = Math.abs(sum - k);
            min = Math.min(diff, min);
            if(temp != min){
                ans[0] = i + 1;
                ans[1] = j + 1;
            }
            temp = min;
            if(sum > k ){
                j--;
            }
            else{
                i++;
            }
        }
        pw.println(ans[0] + " " + ans[1]);
        pw.flush();
    }
}
