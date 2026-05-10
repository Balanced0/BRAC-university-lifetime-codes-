import java.util.*;
import java.io.*;
public class G {
    public static HashMap<Character, ArrayList<String>> map;
    public static String b;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        map = new HashMap<>();
        
        int n = Integer.parseInt(st.nextToken());
        String a = st.nextToken();
        b = st.nextToken();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            char first_char = s.charAt(0);
            map.putIfAbsent(first_char, new ArrayList<>());
            map.get(first_char).add(s);
        }

        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        boolean found = false;
        q.add(a);
        visited.add(a);
        while(!q.isEmpty()){
            String current = q.poll();
            if(current.equals(b)){
                found = true;
                break;
            }
            char last = current.charAt(current.length() - 1);
            for(String next: map.getOrDefault(last, new ArrayList<>())){
                if(!visited.contains(next)){
                    visited.add(next);
                    q.add(next);
                }
                else if(visited.contains(next) && next.equals(b)){
                    found = true;
                    break;
                }
            }
            map.remove(last);
        }
        if(found){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }
        pw.flush();
    }
}