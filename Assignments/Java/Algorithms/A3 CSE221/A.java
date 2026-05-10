import java.util.*;
import java.io.*;
public class A {
    public static long inversions = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        //Taking Inputs here
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] new_arr = mergeSort(arr);
        pw.println(inversions);
        for(int i = 0; i < new_arr.length; i++){
            pw.print(new_arr[i] + " ");
        }
        pw.println();
        pw.flush();
    }

    public static int[] mergeSort(int[] arr){
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
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int first_pointer = 0;
        int second_pointer = 0;
        int[] arr = new int[arr1.length + arr2.length];
        int counter = 0;
        while(first_pointer < arr1.length && second_pointer < arr2.length){
            if(arr1[first_pointer] <= arr2[second_pointer]){
                arr[counter++] = arr1[first_pointer];
                first_pointer++;
            }
            else{
                arr[counter++] = arr2[second_pointer];
                // Main Thing here <--------------
                inversions += arr1.length - first_pointer;
                second_pointer++;
            }
        }
        while(first_pointer < arr1.length){
            arr[counter++] = arr1[first_pointer];
            first_pointer++;
        }
        while(second_pointer < arr2.length){
            arr[counter++] = arr2[second_pointer];
            second_pointer++;
        }
        return arr;
    }
}
