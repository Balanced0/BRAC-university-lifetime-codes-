import java.util.*;
import java.io.*;
public class A {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] parent;
    public static int[] color;
    public static int timer;
    public static boolean hasCycle;
    public static int[] s_time;
    public static int[] f_time;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for(int l = 0; l < t; l++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            g = new ArrayList<>();
            for(int i = 0; i <= n; i++){
                g.add(new ArrayList<>());
            }
            for(int i = 0; i < m; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                g.get(a).add(b);
            }

            
            parent = new int[n + 1];
            color = new int[n + 1];
            s_time = new int[n + 1];
            f_time = new int[n + 1];
            hasCycle = false;
            timer = 0;

            Arrays.fill(parent, -1);
            Arrays.fill(color, 0);
            Arrays.fill(s_time, 0);
            Arrays.fill(f_time, 0);

            for(int i = 1; i <= n; i++){
                if(color[i] == 0){
                    dfsVisit(g, i);
                }
            }

            if(hasCycle){
                pw.println(-1);
            }
            else{
                Integer[] nodes = new Integer[n];
                for(int i = 0; i < n; i++){
                    nodes[i] = i+1;
                }
                Arrays.sort(nodes, (a, b) -> f_time[b] - f_time[a]);
                for(int node: nodes){
                    pw.print(node + " ");
                }
            }
            pw.println();
            pw.flush();
        }
    }
    public static void dfsVisit(ArrayList<ArrayList<Integer>> g, int u){
        color[u] = 1;
        s_time[u] = ++timer;
        for(int v: g.get(u)){
            if(color[v] == 0){
                color[v] = 1;
                parent[v] = u;
                dfsVisit(g, v);
            }
            else if(color[v] == 1){
                hasCycle = true;
            }
        }
        color[u] = 2;
        f_time[u] = ++timer;
    }
}
