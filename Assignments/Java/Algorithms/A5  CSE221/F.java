import java.util.*;
import java.io.*;
public class F {
    public static ArrayList<ArrayList<Integer>> g;
    public static boolean[] visited;
    public static int[] subtree;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int[] q_arr = new int[q];
        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            q_arr[i] = Integer.parseInt(st.nextToken());
        }

        //MAIN PART

        subtree = new int[n + 1];
        visited = new boolean[n + 1];

        DFS(r, -1);
        for(int i = 0; i < q; i++){
            pw.println(subtree[q_arr[i]]);
        }
        pw.flush();
    }
    public static int DFS(int u, int parent){
        visited[u] = true;
        subtree[u] = 1;
        for(int v: g.get(u)){
            if(!visited[v]){
                visited[v] = true;
                subtree[u] += DFS(v, u);
            }
        }
        return subtree[u];
    }
}
