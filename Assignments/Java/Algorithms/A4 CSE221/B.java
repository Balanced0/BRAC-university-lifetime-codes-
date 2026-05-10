import java.util.*;
import java.io.*;
public class B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //head
        int[] u = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < u.length; i++){
            u[i] = Integer.parseInt(st.nextToken());
        }
        //tail
        int[] v = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(st.nextToken());
        }
        //weight
        int[] w = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < w.length; i++){
            w[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, LinkedList<Node>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            if(!map.containsKey(u[i])){
                map.put(u[i], new LinkedList<>());
            }
            map.get(u[i]).add(new Node(v[i], w[i]));
        }
        for(int i = 1; i <= n; i++){
            pw.print(i + ": ");
            if(map.containsKey(i)){
                LinkedList<Node> list = map.get(i);
                for(int j = 0; j < list.size(); j++){
                    Node node = list.get(j);
                    pw.print("(" + node.node + "," + node.weight + ") ");
                }
            }
            pw.println();
        }
        pw.flush();
    }
    public static class Node{
        int node;
        int weight;
        Node(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
}
