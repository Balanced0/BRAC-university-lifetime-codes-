/*
Steps:

Run Dijkstra from S
→ get distS[i] = shortest time for Alice to reach i
Run Dijkstra from T
→ get distT[i] = shortest time for Bob to reach i
For every node i:
both must be reachable
meeting time at i is:

max(distS[i], distT[i])

because one person can wait.

Choose the node with:
minimum meeting time
if tie → smaller node number

*/

import java.util.*;
import java.io.*;
public class B {
    public static ArrayList<ArrayList<Edge>> g;
    public static int[] distance1;
    public static int[] parent1;
    public static int[] distance2;
    public static int[] parent2;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            g.get(u).add(new Edge(v, w));
        }

        distance1 = new int[n + 1];
        parent1 = new int[n + 1];
        distance2 = new int[n + 1];
        parent2 = new int[n + 1];

        dijkstra1(g, s);
        dijkstra2(g, t);

        int min_distance = Integer.MAX_VALUE;
        int ans_node = 0;

        for(int i = 1; i <= n; i++){
            if(distance1[i] != Integer.MAX_VALUE && distance2[i] != Integer.MAX_VALUE){
                int time = Math.max(distance1[i], distance2[i]);
                if(time < min_distance){
                    min_distance = time;
                    ans_node = i;
                }
                else if(time == min_distance && i < ans_node){
                    ans_node = i;
                }
            }
        }

        if(min_distance == Integer.MAX_VALUE){
            pw.println(-1);
        }
        else{
            pw.println(min_distance + " " + ans_node);
        }

        pw.flush();
    }

    public static void dijkstra1(ArrayList<ArrayList<Edge>> g, int s){
        Arrays.fill(distance1, Integer.MAX_VALUE);
        Arrays.fill(parent1, -1);

        distance1[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance - b.distance
        );
        pq.add(new Pair(s, 0));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            for(Edge v: g.get(u)){
                if(distance1[v.to] > distance1[u] + v.weight){
                    distance1[v.to] = distance1[u] + v.weight;
                    parent1[v.to] = u;
                    pq.add(new Pair(v.to, distance1[v.to]));
                }
            }
        }
    }

    public static void dijkstra2(ArrayList<ArrayList<Edge>> g, int s){
        Arrays.fill(distance2, Integer.MAX_VALUE);
        Arrays.fill(parent2, -1);

        distance2[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.distance - b.distance
        );
        pq.add(new Pair(s, 0));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            for(Edge v: g.get(u)){
                if(distance2[v.to] > distance2[u] + v.weight){
                    distance2[v.to] = distance2[u] + v.weight;
                    parent2[v.to] = u;
                    pq.add(new Pair(v.to, distance2[v.to]));
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
