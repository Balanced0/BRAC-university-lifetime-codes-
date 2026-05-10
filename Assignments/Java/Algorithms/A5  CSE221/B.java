import java.util.*;
import java.io.*;
public class B{
    // SEE HERE
    public static ArrayList<ArrayList<Integer>> g;
    public static PrintWriter pw;
    public static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        g  = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }

        int[] u_arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            u_arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] v_arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            v_arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            g.get(u_arr[i]).add(v_arr[i]);
            g.get(v_arr[i]).add(u_arr[i]);
        }

        // Main Part

        boolean[] visited = new boolean[n + 1];

        sb = new StringBuilder();

        DFS(1, visited);
        pw.println(sb);
        pw.flush();
    }
    public static void DFS(int u , boolean[] visited){
        sb.append(u).append(" ");
        visited[u] = true;
        for(int v : g.get(u)){
            if(!visited[v]){
                DFS(v, visited);
            }
        }
    }
}