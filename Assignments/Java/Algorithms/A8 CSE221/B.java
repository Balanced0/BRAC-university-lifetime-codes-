import java.util.*;
import java.io.*;
public class B {
    public static int[] parent;
    public static int[] rank;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        rank = new int[n + 1];

        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        int[][] edges = new int[m][3];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edges[i][0] = u;
            edges[i][1] = v;
            edges[i][2] = w;
        }

        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        long mstCost = 0;

        for(int[] edge: edges){
            int parentU = find(edge[0]);
            int parentV = find(edge[1]);
            if(parentU != parentV){
                union(parentU, parentV);
                mstCost += edge[2];
            }
        }

        pw.println(mstCost);
        pw.flush();
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
