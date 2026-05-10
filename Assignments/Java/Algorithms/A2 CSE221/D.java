import java.io.*;
import java.util.*;
public class D {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        
        int[] arr = new int[n+m];
        int first_pointer = 0;
        int second_pointer = 0;
        int counter = 0;
        while(first_pointer < n && second_pointer < m){
            if(arr1[first_pointer] < arr2[second_pointer]){
                arr[counter++] = arr1[first_pointer++];
            }
            else{
                arr[counter++] = arr2[second_pointer++];
            }
        }
        if(first_pointer < n){
            for(int i = first_pointer; i < n; i++){
                arr[counter++] = arr1[first_pointer++];
            }
        }
        else{
            for(int i = second_pointer; i < m; i++){
                arr[counter++] = arr2[second_pointer++];
            }
        }
        for(int i = 0; i < arr.length; i++){
            pw.print(arr[i] + " ");
        }
        pw.flush();
    }
}
