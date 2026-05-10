import java.util.*;
import java.io.*;
public class H {
    public static int[] postorder;
    public static HashMap<Integer, Integer> map;
    public static PrintWriter pw;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        map = new HashMap<>();

        int[] inorder = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            inorder[i] = Integer.parseInt(st.nextToken());
            map.put(inorder[i], i);
        }
        
        postorder = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            postorder[i] = Integer.parseInt(st.nextToken());
        }
        preTraversal(0, n-1, 0, n-1);
        pw.println();
        pw.flush();
    }
    public static void preTraversal(int left, int right, int postLeft, int postRight){
        if(left > right){
            return;
        }
        int root = postorder[postRight];
        int rootIndex = map.get(root);
        int leftSize = rootIndex - left;
        pw.print(root + " ");
        preTraversal(left, rootIndex - 1, postLeft, postLeft + leftSize - 1);
        preTraversal(rootIndex + 1, right, postLeft + leftSize, postRight - 1);
    }
}
