import java.io.*;
import java.util.*;
public class F {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        
        int first_pointer = 0;
        int second_pointer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_size = 0;
        while(second_pointer < n){
            int current = map.getOrDefault(arr[second_pointer], 0);
            map.put(arr[second_pointer], ++current);
            second_pointer++;
            while(map.size() > k){
                int temp = map.get(arr[first_pointer]);
                map.put(arr[first_pointer], --temp);
                temp = map.get(arr[first_pointer]);
                if(temp == 0){
                    map.remove(arr[first_pointer]);
                }
                first_pointer++;
            }
            max_size = Math.max(max_size, (second_pointer-first_pointer));
        }
        pw.println(max_size);
        pw.flush();
    }
}
