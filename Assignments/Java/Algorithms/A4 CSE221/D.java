import java.util.*;
import java.io.*;
public class D {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for(int i = 0; i < m; i++){
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        int odd_counter = 0;
        int even_counter = 0;
        for(int key:map.keySet()){
            int temp = map.get(key);
            if(temp%2 == 0){
                even_counter++;
            }
            else{
                odd_counter++;
            }
        }
        if(odd_counter == 2){
            pw.println("YES");
        }
        else if(odd_counter == 0){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }
        pw.flush();
    }
}
