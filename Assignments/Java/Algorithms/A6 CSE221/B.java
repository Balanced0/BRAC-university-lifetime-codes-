import java.util.*;
import java.io.*;
public class B {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] color;
    public static boolean[] visited;
    public static int ans = 0;
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
       
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        color = new int[n + 1];
        visited = new boolean[n + 1];

        for(int i = 1; i<=n; i++){
            if(!visited[i]){
                BFS(i, visited);
            }
        }
     
        pw.println(ans);
        pw.flush();
    }

    public static void BFS(int s, boolean[] visited){
        // here 1 is red and 2 is green
        int green_counter = 0;
        int red_counter = 0;
        color[s] = 1;
        visited[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();

            if(color[u] == 1){
                red_counter++;
            }
            else if(color[u] == 2){
                green_counter++;
            }

            for(int v: g.get(u)){
                if(!visited[v] && color[v] == 0){
                    visited[v] = true;
                    color[v] = opposite(color[u]);
                    q.add(v);
                }
            }
        }

        ans = ans + Math.max(green_counter, red_counter);
    }

    public static int opposite(int num){
        if(num == 1){
            return 2;
        }
        return 1;
    }
}
