import java.util.*;
import java.io.*;
public class G {
    public static int index = 0;
    public static int[] preorder;
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
        
        preorder = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            preorder[i] = Integer.parseInt(st.nextToken());
        }
        postTraversal(0, n-1);
        pw.println();
        pw.flush();
    }
    public static void postTraversal(int left, int right){
        if(left > right){
            return;
        }
        int root = preorder[index++];
        int rootIndex = map.get(root);
        postTraversal(left, rootIndex - 1);
        postTraversal(rootIndex + 1, right);
        pw.print(root + " ");
    }
}
