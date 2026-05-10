import java.util.*;
import java.io.*;
public class E {
    public static ArrayList<ArrayList<Integer>> g;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            g.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        int[] sources = new int[s];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < s; i++){
            sources[i] = Integer.parseInt(st.nextToken());
        }

        int[] destinations = new int[q];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < q; i++){
            destinations[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];

        Arrays.fill(distance, -1);

        ArrayDeque<Integer> que = new ArrayDeque<>();

        for(int i = 0; i < s; i++){
            visited[sources[i]] = true;
            distance[sources[i]] = 0;
            que.add(sources[i]);
        }

        while(!que.isEmpty()){
            int u = que.poll();
            for(int v: g.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    distance[v] = distance[u] + 1;
                    que.add(v);
                }
            }
        }
        

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < destinations.length; i++){
            sb.append(distance[destinations[i]]).append(" ");
        }
        pw.println(sb);
        pw.flush();
    }
}
