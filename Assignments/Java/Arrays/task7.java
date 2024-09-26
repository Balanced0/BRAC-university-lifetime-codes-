public class task7{
    public static void main(String[] args){
        int arr [] = {23,100,23,56,100};
        System.out.println("Input array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("New array:");
        int newArr[] = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            boolean flag  = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                }
            }
            
            if(flag == false){
                newArr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}