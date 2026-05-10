
/*
IDEA:

Step 1:

Run BFS from S → get path S → K

Step 2:

Run BFS from K → get path K → D

Step 3:

If either doesn’t exist → -1

Otherwise:

Combine both paths
Total distance = dist[S→K] + dist[K→D]
*/
import java.util.*;
import java.io.*;
public class D {
    //SEE HERE
    public static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    public static int[] distance;
    public static int[] color;
    public static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
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

        //MAIN PART

        distance = new int[n + 1];
        color = new int[n + 1];
        parent = new int[n + 1];

        BFS(g, s);

        if(distance[k] == -1){
            pw.println(-1);
        }
        else{
            int dis1 = distance[k];
            ArrayList<Integer> list1 = new ArrayList<>();
            int current = k;
            while(current != -1){
                list1.add(current);
                current = parent[current];
            }
            Collections.reverse(list1);

            BFS(g, k);

            if(distance[d] == -1){
                pw.println(-1);
            }
            else{
                ArrayList<Integer> list2= new ArrayList<>();
                current = d;
                while(current != -1){
                    list2.add(current);
                    current = parent[current];
                }
                Collections.reverse(list2);

                int dis2 = distance[d];

                pw.println(dis1 + dis2);
                for(int i = 1; i < list2.size(); i++){
                    list1.add(list2.get(i));
                }
                for(int node: list1){
                    pw.print(node + " ");
                }
                pw.println();
            }

        }
        
        pw.flush();
    }

    public static void BFS(ArrayList<ArrayList<Integer>> g, int s){
        Arrays.fill(distance, -1);
        Arrays.fill(color, 0);
        Arrays.fill(parent, -1);

        color[s] = 1;
        distance[s] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            ArrayList<Integer> list = g.get(u);
            for(int v: list){
                if(color[v] == 0){
                    color[v] = 1;
                    distance[v] = distance[u] + 1;
                    parent[v] = u;
                    q.add(v);
                }
            }
            color[u] = 2;
        }
    }
}
