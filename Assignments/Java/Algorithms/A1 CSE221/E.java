import java.io.*;
import java.util.*;
public class E{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder s = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 2; j++){
                if(arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                    s = s.append(j+1).append(" ").append(j+3).append("\n");
                    counter++;
                }
            }
        }
        boolean reverse_possible = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]){
                reverse_possible = false;
                break;
            }
        }
        if(reverse_possible == false){
            pw.println("NO");
        }
        else{
            pw.println("YES");
            pw.println(counter);
            pw.print(s);
        }
        pw.close();
    }
}
