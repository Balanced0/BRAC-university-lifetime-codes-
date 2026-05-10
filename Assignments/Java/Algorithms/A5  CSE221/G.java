import java.util.*;
import java.io.*;
public class G {
    public static ArrayList<ArrayList<Integer>> g;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
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
        }

        
        boolean[] visited = new boolean[n + 1];
        boolean[] recPath = new boolean[n + 1];

        boolean cycle = false;
        for(int i = 0; i <= n; i++){
            if(!visited[i]){
                if(isCycle(i, visited, recPath)){
                    cycle = true;
                    break;
                }
            }
        }
        if(cycle){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }
        pw.flush();
    }

    public static boolean isCycle(int u, boolean[] visited, boolean[] recPath){
        visited[u] = true;
        recPath[u] = true;
        for(int v: g.get(u)){
            if(!visited[v]){
                if(isCycle(v, visited, recPath)){
                    return true;
                }
            }
            else if(recPath[v]){
                return true;
            }
        }
        recPath[u] = false;
        return false;
    }
}
