import java.util.*;
import java.io.*;
public class C {
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
        ArrayList<int[]> mstEdges = new ArrayList<>();
        boolean[] inMst = new boolean[m];

        for(int i = 0; i< m; i++){
            int parentU = find(edges[i][0]);
            int parentV = find(edges[i][1]);
            if(parentU != parentV){
                union(parentU, parentV);
                mstCost += edges[i][2];
                mstEdges.add(edges[i]);
                inMst[i] = true;
            }
        }

        if(mstEdges.size() != n - 1){
            pw.println(-1);
            pw.flush();
            return;
        }

        ArrayList<int[]>[] tree = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) tree[i] = new ArrayList<>();
        for(int[] e : mstEdges){
            tree[e[0]].add(new int[]{e[1], e[2]});
            tree[e[1]].add(new int[]{e[0], e[2]});
        }

        long secondMst = Long.MAX_VALUE;

        for(int i = 0; i < m; i++){
            if(inMst[i]){
                continue;
            }

            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            int[] parentNode = new int[n + 1];
            int[] maxW = new int[n + 1];
            boolean[] visited = new boolean[n + 1];

            Queue<Integer> q = new LinkedList<>();
            q.add(u);
            visited[u] = true;
            while(!q.isEmpty()){
                int current = q.poll();
                for(int[] neighbor : tree[current]){
                    int next = neighbor[0];
                    int weight = neighbor[1];
                    if(!visited[next]){
                        visited[next] = true;
                        parentNode[next] = current;
                        maxW[next] = Math.max(maxW[current], weight);
                        q.add(next);
                    }
                }
            }

            int best = 0;
            int current = v;
            while(current != u){
                int weight = maxW[current] - maxW[parentNode[current]] == 0
                        ? maxW[current]
                        : maxW[current];
                int edgeW = maxW[current];
                current = parentNode[current];
            }
            
            long c = mstCost - maxW[v] + w;
            if(c > mstCost){
                secondMst = Math.min(secondMst, c);
            }
        }

        if(secondMst == Long.MAX_VALUE){
            pw.println(-1);
        }
        else{
            pw.println(secondMst);
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
