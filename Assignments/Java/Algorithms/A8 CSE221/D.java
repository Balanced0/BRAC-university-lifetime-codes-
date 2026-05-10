import java.util.*;
import java.io.*;
public class D {
    public static int[] parent;
    public static int[] rank;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(st.nextToken());

        for(int l = 0; l< t; l++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int[] u_arr = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < u_arr.length; i++){
                u_arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] v_arr = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < v_arr.length; i++){
                v_arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] w_arr = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < w_arr.length; i++){
                w_arr[i] = Integer.parseInt(st.nextToken());
            }

            int[][] edges = new int[m][3];
            
            for(int i = 0; i <edges.length; i++){
                edges[i][0] = u_arr[i];
                edges[i][1] = v_arr[i];
                edges[i][2] = w_arr[i];
            }

            Arrays.sort(edges, (a, b) -> b[2] - a[2]);

            parent = new int[n + 1];
            rank = new int[n + 1];

            for(int i = 0; i < parent.length; i++){
                parent[i] = i;
                rank[i] = 0;
            }

            int ans = 0;

            for(int i = 0; i < m; i++){
                int u = edges[i][0];
                int v = edges[i][1];

                union(u, v);

                if(find(s) == find(d)){
                    ans = edges[i][2];
                    break;
                }
            }

            pw.println(ans);
            pw.flush();
        }
    }

    public static void union(int a, int b){
        int parentA = find(a);
        int parentB = find(b);

        if(parentA == parentB){
            return;
        }

        if(rank[parentA] == rank[parentB]){
            parent[parentB] = parentA; 
            rank[parentA]++;
        }
        else if(rank[parentA] > rank[parentB]){
            parent[parentB] = parentA;
        }
        else{
            parent[parentA] = parentB;
        }
    }
    
    public static int find(int x){
        if(parent[x] == x){
            return x;
        }
        return find(parent[x]);
    }
    
}
