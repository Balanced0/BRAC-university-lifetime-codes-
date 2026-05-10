import java.util.*;
import java.io.*;
public class E {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] color;
    public static int[] component;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
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

        //MAIN PART

        color = new int[n+1];
        component = new int[n+1];
        int id = 1;

        for(int i = 1; i <= n; i++){
            if(component[i] == 0){
                BFS(i, id++);
            }
        }

        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(component[x] == component[y]){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        
        pw.flush();
    }
    public static void BFS(int s, int id){
        color[s] = 1;
        component[s] = id;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            ArrayList<Integer> list = g.get(u);
            for(int v: list){
                if(color[v] == 0){
                    color[v] = 1;
                    component[v] = id;
                    q.add(v);
                }
            }
            color[u] = 2;
        }
    }
}
