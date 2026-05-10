import java.util.*;
import java.io.*;
public class D {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] distance;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        g = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        distance = new int[n + 1];

        BFS(1, visited);

        int node1 = 1;
        for(int i = 1; i <= n; i++){
            if(distance[i] > distance[node1]){
                node1 = i;
            }
        }

        Arrays.fill(visited, false);

        BFS(node1, visited);

        int node2 = node1;
        for(int i = 1; i <= n; i++){
            if(distance[i] > distance[node2]){
                node2 = i;
            }
        }

        int max_distance = distance[node2];
        pw.println(max_distance);
        pw.println(node1 + " " + node2);
        pw.flush();
    }
    public static void BFS(int s, boolean[] visited){
        visited[s] = true;
        distance[s] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v: g.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    distance[v] = distance[u] + 1;
                    q.add(v);
                }
            }
        }
    }
}
