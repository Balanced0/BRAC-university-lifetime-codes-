import java.util.*;
import java.io.*;
public class A {
    public static ArrayList<ArrayList<Edge>> g;
    public static int[] distance;
    public static int[] parent;
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
        
        int[] u_arr = new int[m];
        int[] v_arr = new int[m];
        int[] w_arr = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < u_arr.length; i++){
            u_arr[i] =  Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < v_arr.length; i++){
            v_arr[i] =  Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < w_arr.length; i++){
            w_arr[i] =  Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            g.get(u_arr[i]).add(new Edge(v_arr[i], w_arr[i]));
        }

        distance = new int[n + 1];
        parent = new int[n + 1];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        distance[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance -  b.distance
        );

        pq.add(new Pair(s, 0));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;

            if(current.distance != distance[u]){
                continue;
            }

            for(Edge v: g.get(u)){
                if(distance[v.to] > distance[u] + v.weight){
                    distance[v.to] =  distance[u] + v.weight;
                    parent[v.to] = u;
                    pq.add(new Pair(v.to, distance[v.to]));
                }
            }
        }

        if(distance[d] == Integer.MAX_VALUE){
            pw.println(-1);
        }
        else{
            ArrayList<Integer> path = new ArrayList<>();

            int current = d;

            while(current != -1){
                path.add(current);
                current = parent[current];
            }

            Collections.reverse(path);
            pw.println(distance[d]);

            for(int node: path){
                pw.print(node + " ");
            }

            pw.println();
        }

        pw.flush();
    }

    public static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
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
}
