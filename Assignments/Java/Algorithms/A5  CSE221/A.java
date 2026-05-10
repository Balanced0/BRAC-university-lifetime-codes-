import java.util.*;
import java.io.*;
public class A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
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


        //Real part here
        int[]color = new int[n + 1];
        for(int i = 0; i < color.length; i++){
            color[i] = 0;
        }
        Queue<Integer> q = new LinkedList<>();
        color[1] = 1;
        pw.print(1 + " ");
        q.add(1);
        while(q.size() != 0){
            int u = q.poll();
            ArrayList<Integer> list = g.get(u);
            for(int v:list){
                if(color[v] == 0){
                    pw.print(v + " ");
                    color[v] = 1;
                    q.add(v);
                }
            }
        }
        pw.println();
        pw.flush();
    }
}
