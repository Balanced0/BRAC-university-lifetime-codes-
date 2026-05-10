import java.util.*;
import java.io.*;
public class C {
    public static int[]x_moves = {2, 2, -2, -2, 1, 1, -1, -1};
    public static int[]y_moves = {1, -1, 1, -1, 2, -2, 2, -2};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        

        int[][] color = new int[n + 1][n + 1];
        int[][] distance = new int[n + 1][n + 1];

        for(int i = 0; i < distance.length; i++){
            for(int j = 0; j < distance[0].length; j++){
                distance[i][j] = -1;
            }
        }

        color[x1][y1] = 1;
        distance[x1][y1] = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x1, y1));

        while(!q.isEmpty()){
            Node node = q.poll();
            for(int i = 0; i < x_moves.length; i++){
                int temp_x = node.x + x_moves[i];
                int temp_y = node.y + y_moves[i];
                if(temp_x >= 1 && temp_x <= n && temp_y >= 1 && temp_y <= n){
                    if(color[temp_x][temp_y] == 0){
                        color[temp_x][temp_y] = 1;
                        distance[temp_x][temp_y] = distance[node.x][node.y] + 1;
                        q.add(new Node(temp_x, temp_y));
                    }
                }
            }
            color[node.x][node.y] = 2;
        }

        pw.println(distance[x2][y2]);
        pw.flush();
    }

    public static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
