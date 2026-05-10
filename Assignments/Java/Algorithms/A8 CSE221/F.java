import java.util.*;
import java.io.*;
public class F {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(st.nextToken());

        for(int l = 0; l < t; l++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            ArrayList<Pair> times = new ArrayList<>();

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                times.add(new Pair(s, e));
            }

            Collections.sort(times, (a,b) -> a.e - b.e);

            long counter = 0;

            TreeMap<Integer, Integer> ae = new TreeMap<>();
            ae.put(-1, m);

            for(int i = 0; i < times.size(); i++){
                int s = times.get(i).s;
                int e = times.get(i).e;
                
                Integer prevE = ae.lowerKey(s);

                if(prevE != null){
                    counter++;
                    int count = ae.get(prevE);
                    if(count == 1){
                        ae.remove(prevE);
                    } else {
                        ae.put(prevE, count - 1);
                    }
                    ae.put(e, ae.getOrDefault(e, 0) + 1);
                }
            }

            pw.println(counter);
            pw.flush();
        }
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
