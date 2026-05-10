import java.util.*;
import java.io.*;
public class D {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] distance;
    public static int[] parent;
    public static Node[] nodes;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i<= n; i++){
            g.add(new ArrayList<>());
        }

        int[] weights = new int[n];
        nodes = new Node[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            weights[i] = Integer.parseInt(st.nextToken());
            nodes[i + 1] = new Node(i + 1, weights[i]);
        }

        for(int i = 0; i< m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
        }

        distance = new int[n + 1];
        parent = new int[n + 1];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        dijkstra(g, s);

        if(distance[d] == Integer.MAX_VALUE){
            pw.println(-1);
        }
        else{
            pw.println(distance[d]);
        }
        pw.flush();
    }

    public static void dijkstra(ArrayList<ArrayList<Integer>> g, int s){
        distance[s] = nodes[s].weight;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance - b.distance
        );
        pq.add(new Pair(s, distance[s]));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            for(int v : g.get(u)){
                if(distance[v] > distance[u] + nodes[v].weight){
                    distance[v] = distance[u] + nodes[v].weight;
                    pq.add(new Pair(v, distance[v]));
                    parent[v] = u;
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

    public static class Node{
        int node;
        int weight;
        Node(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
}
