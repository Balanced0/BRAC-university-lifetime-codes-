import java.util.*;
import java.io.*;
public class C {
    public static ArrayList<ArrayList<Edge>> g;
    public static int[] distance;
    public static int[] parent;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }

        for(int i = 0;i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Edge(v, w));
            g.get(v).add(new Edge(u, w));
        }

        distance = new int[n + 1];
        parent = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        dijkstra(g, 1);

        for(int i = 1; i <= n; i++){
            if(distance[i] == Integer.MAX_VALUE){
                pw.print(-1 + " ");
            }
            else{
                pw.print(distance[i] + " ");
            }
        }
        pw.println();
        pw.flush();
    }
    public static void dijkstra(ArrayList<ArrayList<Edge>> g, int s){
        distance[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance - b.distance
        );

        pq.add(new Pair(s, 0));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            for(Edge v: g.get(u)){
                if(distance[v.to] > Math.max(distance[u], v.weight)){
                    distance[v.to] = Math.max(distance[u], v.weight);
                    pq.add(new Pair(v.to, distance[v.to]));
                    parent[v.to] = u;
                }
            }
        }
    }

    public static class Pair{
        int node;
        int distance;
        Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
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
