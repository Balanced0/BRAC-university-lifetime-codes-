public class task2{
    public static void main(String[] args){
        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After replacing duplicates with 0:");
        for(int i = 0; i < arr.length; i++){
            boolean duplicate = false;
            for(int j = 0;j < i; j++){
                if(arr[i] == arr[j]){
                   duplicate = true;
                   break;
                }
            }
            if(duplicate){
                arr[i] = 0;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
