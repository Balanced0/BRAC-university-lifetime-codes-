import java.util.*;
public class H {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        String[] train = new String[n];
        int[] time = new int[n];
        for(int i = 0; i < n; i++){
            String[] temp = arr[i].split(" ");
            train[i] = temp[0];
            time[i] = time_converter(temp[temp.length - 1]);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                int diff = compare(train[j], train[j+1]);
                if(diff > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    temp = train[j];
                    train[j] = train[j+1];
                    train[j+1] = temp;
                    int temp0 = time[j];
                    time[j] = time[j+1];
                    time[j+1] = temp0;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                int diff = compare(train[j], train[j+1]);
                if(diff == 0 && time[j] < time[j+1]){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    temp = train[j];
                    train[j] = train[j+1];
                    train[j+1] = temp;
                    int temp0 = time[j];
                    time[j] = time[j+1];
                    time[j+1] = temp0;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static int time_converter(String t){
        String[] arr = t.split(":");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        return ((h*60) + m);
    }
    public static int compare(String s1, String s2){
        int min = Math.min(s1.length(), s2.length());
        for(int i = 0; i < min; i++){
            int temp1 = position(s1.charAt(i));
            int temp2 = position(s2.charAt(i));
            if(temp1 != temp2){
                return temp1 - temp2;
            }
        }
        return s1.length() - s2.length();
    }
    public static int position(char c){
        if(c >= 'a' && c <= 'z'){
            return c - 'a';
        }
        return 26 + (c - 'A');
    }
}
