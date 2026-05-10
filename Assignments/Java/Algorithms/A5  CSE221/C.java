// Tough
import java.util.*;
import java.io.*;
public class C {
    //SEE HERE
    public static ArrayList<ArrayList<Integer>> g;
    public static PrintWriter pw;
    public static int[] distance;
    public static int[] color;
    public static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

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

        //MAIN PART

        for(int i = 1; i <= n; i++){
            Collections.sort(g.get(i));
        }

        distance = new int[n + 1];
        color = new int[n + 1];
        parent = new int[n + 1];

        BFS(g, s);

        if(distance[d] == -1){
            pw.println(-1);
        }
        else{
            pw.println(distance[d]);
            ArrayList<Integer> ans = new ArrayList<>();
            int current = d;
            while(current != -1){
                ans.add(current);
                current = parent[current];
            }
            Collections.reverse(ans);
            for(int node : ans){
                pw.print(node + " ");
            }
            pw.println();
        }
        pw.flush();
    }
    public static void BFS(ArrayList<ArrayList<Integer>> g, int s){
        Arrays.fill(distance, -1);
        Arrays.fill(color, 0);
        Arrays.fill(parent, -1);

        color[s] = 1;
        distance[s] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            ArrayList<Integer> list = g.get(u);
            for(int v: list){
                if(color[v] == 0){
                    color[v] = 1;
                    distance[v] = distance[u] + 1;
                    parent[v] = u;
                    q.add(v);
                }
            }
            color[u] = 2;
        }
    }
}
