import java.io.*;
import java.util.*;
public class C {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        values[] number = new values[n];
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(st.nextToken());
            number[i] = new values(arr[i], i);
        }
        Arrays.sort(arr);
        long[] ans = new long[3];
        boolean found = false;
        for(int i = 0; i < n; i++){
            int left_pointer = i + 1;
            int right_pointer = n - 1;
            while(left_pointer < right_pointer){
                long sum = arr[i];
                sum = sum + arr[right_pointer] + arr[left_pointer];
                if(sum > x){
                    right_pointer--;
                }
                else if(sum < x){
                    left_pointer++;
                }
                else{
                    found = true;
                    ans[0] = arr[i];
                    ans[1] = arr[left_pointer];
                    ans[2] = arr[right_pointer];
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            pw.println(-1);
            pw.flush();
            return;
        }
        boolean[] visited = new boolean[n];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < number.length; j++){
                if(!visited[number[j].index] && ans[i] == number[j].value){
                    pw.print((number[j].index + 1) + " ");
                    visited[number[j].index] = true;
                    break;
                }
            }
        }
        System.out.println();
        pw.flush();
    }
    static class values{
        long value;
        int index;
        values(long value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
