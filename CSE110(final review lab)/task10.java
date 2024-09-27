//Arrays
//Task 7
public class task10{
    public static void main(String[] args){
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
        System.out.println("Prime Numbers:");
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            int count = 0;
            for(int j = 1; j <=a ;j++){
                if(a%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i + ": " + arr[i]);
            }
            
        }
        System.out.println();
        System.out.println("Perfect Numbers:");
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            int sum = 0;
            for(int j = 1; j<a; j++){
                if(a%j == 0){
                    sum = sum + j;
                }
            }
            if(sum == a){
                System.out.println(i + ": " + arr[i]);
            }
        }
    }
}