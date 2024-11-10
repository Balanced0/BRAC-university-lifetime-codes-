import java.util.Scanner;
public class task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] uniqueArr = new int[n];
        int index = 0;
        
        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < index; j++){
                if(arr[i] == uniqueArr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArr[index++] = arr[i];
            }
        }
        for(int i = 0; i < index; i++){
            System.out.print(uniqueArr[i] + ", ");
        }
    }
}