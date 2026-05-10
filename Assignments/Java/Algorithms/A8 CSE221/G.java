import java.util.*;
import java.io.*;
public class G {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());

        ArrayList<Pair> times = new ArrayList<>();

        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            times.add(new Pair(a, d));
        }

        Collections.sort(times, (a,b) -> a.a - b.a);

        long time = 0;
        long total_deadline = 0;
        long finish_time = 0;
        for(int i = 0;i < times.size(); i++){
            time += times.get(i).a;
            finish_time += time;
            total_deadline += times.get(i).d;
        }

        long answer = total_deadline - finish_time;
        pw.println(answer);
        pw.flush();
    }

    public static class Pair{
        int a;
        int d;
        Pair(int a, int d){
            this.a = a;
            this.d = d;
        }
    }
}
