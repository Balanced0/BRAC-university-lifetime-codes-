import java.io.*;
import java.util.*;
public class E {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        
        int first_pointer = 0;
        int second_pointer = 0;
        int subarr_size = 0;
        long sum = 0;
        int max_size = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            second_pointer++;
            while(sum > k){
                sum = sum - arr[first_pointer];
                first_pointer++;
            }
            subarr_size = second_pointer - first_pointer;
            max_size = Math.max(max_size, subarr_size);
        }
        pw.println(max_size);
        pw.flush();
    }
}
