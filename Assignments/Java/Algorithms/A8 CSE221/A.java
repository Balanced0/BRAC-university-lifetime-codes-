import java.util.*;
import java.io.*;
public class A {
    public static int[] parent;
    public static int[] rank;
    public static int[] size;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        rank = new int[n + 1];
        size = new int[n + 1];

        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
            pw.println(size[find(a)]);
        }
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
            size[parentA] += size[parentB];
        }
        else if(rank[parentA] > rank[parentB]){
            parent[parentB] = parentA;
            size[parentA] += size[parentB];
        }
        else{
            parent[parentA] = parentB;
            size[parentB] += size[parentA];
        }
    }
    
    public static int find(int x){
        if(parent[x] == x){
            return x;
        }
        return find(parent[x]);
    }
}
