import java.util.*;
import java.io.*;
public class H {
    public static ArrayList<ArrayList<Integer>> g;
    public static int[] indegree;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[] dictionary = new String[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            dictionary[i] = s;
        }

        g = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            g.add(new ArrayList<>());
        }

        indegree = new int[26];

        boolean[] appears = new boolean[26];
        for(String word : dictionary){
            for(char c : word.toCharArray()){
                appears[c - 'a'] = true;
            }
        }
        
        for(int i = 0; i < dictionary.length - 1; i++){
            String s1 = dictionary[i];
            String s2 = dictionary[i + 1];

            if(s1.startsWith(s2) && s1.length() > s2.length()){
                pw.println(-1);
                pw.flush();
                return;
            }

            int temp = Math.min(s1.length(), s2.length());

            for(int j = 0; j < temp; j++){
                char u = s1.charAt(j);
                char v = s2.charAt(j);
                if(u != v){
                    int from = u - 'a';
                    int to = v - 'a';
                    if(!g.get(from).contains(to)){
                        g.get(from).add(to);
                        indegree[to]++;
                    }
                    break;
                }
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>();

        for(int i = 0; i < indegree.length; i++){
            if(appears[i] && indegree[i] == 0){
                pq.add((char) (i + 'a'));
            }
        }

        StringBuilder ans = new StringBuilder();  

        while(!pq.isEmpty()){
            char current = pq.poll();
            ans.append(current);
            for(int v: g.get(current - 'a')){
                indegree[v]--;
                if(indegree[v] == 0){
                    pq.add((char)(v + 'a'));
                }
            }
        }

        int distinctCounter = 0;
        for(int i = 0; i < appears.length; i++){
            boolean b = appears[i];
            if(b){
                distinctCounter++;
            }
        }

        if(ans.length() != distinctCounter){
            pw.println(-1);
        }
        else{
            pw.println(ans);
        }

        pw.flush();
    }
}
