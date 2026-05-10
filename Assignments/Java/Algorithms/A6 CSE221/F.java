import java.util.*;
import java.io.*;
public class F {
    public static int[] distance;
    public static HashMap<Integer, Integer> forbidden;
    public static int c;
    public static boolean found = false;
    public static int[] power = {1000, 100, 10, 1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        forbidden = new HashMap<>();
        int s = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int forbidden_comb = Integer.parseInt(st.nextToken());
            forbidden.putIfAbsent(forbidden_comb, 1);
        }

        distance = new int[10000];
        boolean[] visited = new boolean[10000];

        BFS(s, visited);

        if(found){
            pw.println(distance[c]);
        }
        else{
            pw.println(-1);
        }
        pw.flush();
    }
    public static void BFS(int s, boolean[] visited){
        visited[s] = true;
        distance[s] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();

            if(u == c){
                found = true;
                return;
            }

            for(int i = 0; i < 4; i++){
                int digit = (u/power[i])%10;
                //for up that is +1
                int up = (digit + 1)%10;
                int v1 = u - digit * power[i] + up * power[i];

                //for down that is -1
                int down = (digit + 9)%10;
                int v2 = u - digit * power[i] + down * power[i];

                if(!visited[v1] && !forbidden.containsKey(v1)){
                    visited[v1] = true;
                    distance[v1] = distance[u] + 1;
                    q.add(v1);
                }

                if(!visited[v2] && !forbidden.containsKey(v2)){
                    visited[v2] = true;
                    distance[v2] = distance[u] + 1;
                    q.add(v2);
                }
            }
        }
    }
}
