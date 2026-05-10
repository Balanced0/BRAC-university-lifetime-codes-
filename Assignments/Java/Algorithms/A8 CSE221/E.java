import java.util.*;
import java.io.*;
public class E {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());

        ArrayList<Pair> times = new ArrayList<>();

        int counter = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            times.add(new Pair(s, e));
        }

        Collections.sort(times, (a,b) -> a.e - b.e);

        ArrayList<Pair> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int s = times.get(i).s;
            int e = times.get(i).e;
            if(ans.isEmpty()){
                ans.add(new Pair(s, e));
                counter++;
            }
            else{
                int prevE = ans.get(ans.size() - 1).e;
                if(s > prevE){
                    ans.add(new Pair(s, e));
                    counter++;
                }
            }
        }

        pw.println(counter);

        for(int i = 0; i < ans.size(); i++){
            pw.println(ans.get(i).s + " " + ans.get(i).e);
        }

        pw.flush();
    }

    public static class Pair{
        int s;
        int e;
        Pair(int s, int e){
            this.s = s;
            this.e = e;
        }
    }
}
