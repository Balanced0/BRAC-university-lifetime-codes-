import java.util.*;
import java.io.*;
public class B {
    public static long inversions = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] new_arr = mergeArrange(arr);
        pw.println(inversions);
        pw.flush();
    }

    public static int[] mergeArrange(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < left.length; i++){
            left[i] = arr[i]; 
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        left = mergeArrange(left);
        right = mergeArrange(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        //Main part 
        for(int i = 0; i < right.length; i++){
            long right_squared = (long)right[i] * right[i];
            int tracker1 = 0;
            int tracker2 = left.length;
            while(tracker1 < tracker2){
                int mid = (tracker1+tracker2)/2;
                if(left[mid] > right_squared){
                    tracker2 = mid;
                }
                else{
                    tracker1 = mid + 1;
                }
            }
            inversions = inversions + left.length - tracker1;
        }

        int first_pointer = 0;
        int second_pointer = 0;
        int[] arr = new int[left.length + right.length];
        int counter = 0;
        while(first_pointer < left.length && second_pointer < right.length){
            if(left[first_pointer] <= right[second_pointer]){
                arr[counter++] = left[first_pointer];
                first_pointer++;
            }
            else{
                arr[counter++] = right[second_pointer];
                second_pointer++;
            }
        }
        while(first_pointer < left.length){
            arr[counter++] = left[first_pointer];
            first_pointer++;
        }
        while(second_pointer < right.length){
            arr[counter++] = right[second_pointer];
            second_pointer++;
        }
        return arr;
    }
}