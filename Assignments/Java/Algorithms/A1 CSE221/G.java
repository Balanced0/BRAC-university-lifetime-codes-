import java.util.*;
public class G{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] id = new int[n];
            for(int j = 0; j < id.length; j++){
                id[j] = sc.nextInt();
            }
            int[] marks = new int[n];
            for(int j = 0; j < marks.length; j++){
                marks[j] = sc.nextInt();
            }
            int[] tracker = new int[n];
            for(int j = 0; j < tracker.length; j++){
                tracker[j] = j;
            }
            for(int j = 0; j < id.length - 1; j++){
                for(int k = 0; k < id.length - 1 - j; k++){
                    if(marks[k] < marks[k + 1]){
                        int temp = marks[k];
                        marks[k] = marks[k+1];
                        marks[k+1] = temp;
                        temp = id[k];
                        id[k] = id[k+1];
                        id[k+1] = temp;
                        temp = tracker[k];
                        tracker[k] = tracker[k + 1];
                        tracker[k + 1] = temp;
                    }
                    if(marks[k] == marks[k+1]){
                        if(id[k] > id[k+1]){
                            int temp = id[k];
                            id[k] = id[k+1];
                            id[k+1] = temp;
                            temp = tracker[k];
                            tracker[k] = tracker[k + 1];
                            tracker[k + 1] = temp;
                        }
                    }
                }
            }
            int[] swap_finder = new int[n];
            for(int j = 0; j < swap_finder.length; j++){
                swap_finder[tracker[j]] = j; 
            }
            boolean[] visited = new boolean[n];
            int min_swaps = 0;
            for(int j = 0; j < visited.length; j++){
                if(visited[j] || swap_finder[j] == j){
                    continue;
                }
                int counter = 0;
                int k = j;
                while(visited[k] != true){
                    visited[k] = true;
                    counter++;
                    k = swap_finder[k];
                }
                min_swaps = min_swaps + counter - 1;
            }
            System.out.println("Minimum swaps: " + min_swaps);
            for(int j = 0; j < id.length; j++){
                System.out.println("ID: " + id[j] + " Mark: " +  marks[j]);
            }
        }
    }
}