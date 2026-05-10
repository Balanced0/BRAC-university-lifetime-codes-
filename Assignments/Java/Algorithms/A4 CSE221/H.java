import java.util.*;
import java.io.*;
public class H {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        Pairs[] arr = new Pairs[q];

        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr[i] = new Pairs(x, k);
        }

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 1; i <= n; i++){
            map.putIfAbsent(i, new ArrayList<>());
            for(int j = 1; j <= n; j++){
                if(i != j){
                    int temp = gcd(i, j);
                    if(temp == 1){
                        map.get(i).add(j);
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            Collections.sort(map.get(i));
        }

        for(int i = 0; i < q; i++){
            int x = arr[i].x;
            int k = arr[i].k;
            ArrayList<Integer> list = map.get(x);
            if(k > list.size()){
                pw.println(-1);
            }
            else{
                pw.println(list.get(k - 1));
            }
        }

        pw.flush();
    }
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }
    static class Pairs{
        int x;
        int k;
        Pairs(int x, int k){
            this.x = x;
            this.k = k;
        }
    }
}
