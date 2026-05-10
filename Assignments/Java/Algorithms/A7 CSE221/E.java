import java.util.*;
import java.io.*;
public class E {
    public static ArrayList<ArrayList<Edge>> g;
    public static int[][] distance;
    public static int[] parent;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

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

        int[] w_arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            w_arr[i] = Integer.parseInt(st.nextToken());
        }

        g = new ArrayList<>();

        for(int i = 0;i <= n; i++){
            g.add(new ArrayList<>());
        }

        distance = new int[n + 1][2];
        parent = new int[n + 1];


        for(int i = 0; i < m; i++){
            g.get(u_arr[i]).add(new Edge(v_arr[i], w_arr[i]));
        }

        for(int i = 0; i <= n; i++){
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        Arrays.fill(parent, -1);

        dijkstra(g, 1);

        int ans = Math.min(distance[n][0], distance[n][1]);

        if(ans == Integer.MAX_VALUE){
            pw.println(-1);
        }
        else{
            pw.println(ans);
        }

        pw.flush();
    }

    public static void dijkstra(ArrayList<ArrayList<Edge>> g, int s){
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance - b.distance
        ); 
        pq.add(new Pair(s, 0, -1));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            int u_distance = current.distance;
            int previousParity = current.parity;
            for(Edge v: g.get(u)){
                int newParity = v.weight % 2;

                if(previousParity != -1 && previousParity == newParity){
                    continue;
                }

                if(distance[v.to][newParity] > u_distance + v.weight){
                    distance[v.to][newParity] = u_distance + v.weight;
                    pq.add(new Pair(v.to, distance[v.to][newParity], newParity));
                }
            }
        }
    }

    public static class Pair{
        int node;
        int distance;
        int parity;
        Pair(int node, int distance, int parity){
            this.node = node;
            this.distance = distance;
            this.parity = parity;
        }
    }

    public static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }
}
