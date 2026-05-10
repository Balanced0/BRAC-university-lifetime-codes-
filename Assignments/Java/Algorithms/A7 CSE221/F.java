import java.util.*;
import java.io.*;
public class F {
    public static ArrayList<ArrayList<Edge>> g;
    public static int[] distance;
    public static int[] second_shr_distance;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());  

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }

        distance = new int[n + 1];
        second_shr_distance = new int[n + 1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine()); 
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            g.get(u).add(new Edge(v, w));
            g.get(v).add(new Edge(u, w));
        }

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(second_shr_distance, Integer.MAX_VALUE);

        dijkstra(g, s);

        if(second_shr_distance[d] == Integer.MAX_VALUE){
            pw.println(-1);
        }
        else{
            pw.println(second_shr_distance[d]);
        }

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
            int u_distance = current.distance;
            for(Edge v: g.get(u)){
                if(distance[v.to] > u_distance + v.weight){
                    second_shr_distance[v.to] = distance[v.to];
                    distance[v.to] = u_distance + v.weight;
                    pq.add(new Pair(v.to, distance[v.to]));
                }
                else if((distance[v.to] < u_distance + v.weight) && (u_distance + v.weight < second_shr_distance[v.to])){
                    second_shr_distance[v.to] = u_distance + v.weight;
                    pq.add(new Pair(v.to, second_shr_distance[v.to]));
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
