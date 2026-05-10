import java.io.*;
import java.util.*;
public class G {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }


        for(int i = 0; i < q; i++){
            long[] query = new long[2];
            st = new StringTokenizer(br.readLine());
            query[0] = Long.parseLong(st.nextToken());
            query[1] = Long.parseLong(st.nextToken());

            
            int tracker_1 = 0;
            int tracker_2 = -1;
            int first_pointer = 0;
            int second_pointer = n - 1;
            while(first_pointer <= second_pointer){
                int mid = (first_pointer + second_pointer)/2;
                if(arr[mid] >= query[0]){
                    tracker_1 = mid;
                    second_pointer = mid - 1;
                }
                else{
                    first_pointer = mid + 1;
                }
            }
            first_pointer = 0;
            second_pointer = n - 1;
            while(first_pointer <= second_pointer){
                int mid = (first_pointer + second_pointer)/2;
                if(arr[mid] <= query[1]){
                    tracker_2 = mid;
                    first_pointer = mid + 1;
                }
                else{
                    second_pointer = mid - 1;
                }
            }
            pw.println(tracker_2 - tracker_1 + 1);
            pw.flush();
        }
    }
}
