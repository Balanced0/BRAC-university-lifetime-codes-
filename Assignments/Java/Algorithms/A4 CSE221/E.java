import java.util.*;
import java.io.*;
public class E {
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
        // HashMap for out-degree
        HashMap<Integer, Integer> outDegree = new HashMap<>();
        for(int i = 0; i < m; i++){
            outDegree.put(arr1[i], outDegree.getOrDefault(arr1[i], 0) + 1);
        }
        // HashMap for indegree
        HashMap<Integer, Integer> inDegree = new HashMap<>();
        for(int i = 0; i < m; i++){
            inDegree.put(arr2[i], inDegree.getOrDefault(arr2[i], 0) + 1);
        }
        for(int i = 1; i <= n; i++){
            int temp = inDegree.getOrDefault(i, 0) - outDegree.getOrDefault(i, 0);
            pw.print(temp + " ");
        }
        pw.println();
        pw.flush();
    }
}
