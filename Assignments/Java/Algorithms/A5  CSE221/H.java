import java.util.*;
import java.io.*;
public class H {
    public static int counter = 0;
    public static int r;
    public static int h;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        r = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        char[][] mat = new char[r][h];
        for(int i = 0; i < r; i++){
            String line = br.readLine();
            for(int j = 0; j < h; j++){
                mat[i][j] = line.charAt(j);
            }
        }
        boolean[][] visited = new boolean[r][h];

        int ans = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < h; j++){
                if(mat[i][j] != '#' && !visited[i][j]){
                    counter = 0;
                    DFS(i, j, visited, mat);
                    ans = Math.max(ans, counter);
                }
            }
        }

        pw.println(ans);
        pw.flush();
    }
    public static void DFS(int i, int j, boolean[][] visited, char[][] mat){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});

        while(!stack.isEmpty()){
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];
            if(x < 0 || x >= r || y < 0 || y >= h || mat[x][y] == '#' || visited[x][y]){
                continue;
            }
            visited[x][y] = true;
            if(mat[x][y] == 'D'){
                counter++;
            }

            stack.push(new int[]{x-1, y});
            stack.push(new int[]{x, y + 1});
            stack.push(new int[]{x+1, y});
            stack.push(new int[]{x, y-1});
        }
    }
}
