import java.util.Scanner;
public class task8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Please enter the elements of the arr1:");
        for(int i = 0; i < n1; i++){
            int a = sc.nextInt();
            arr1[i] = a;
        }
        System.out.print("Please enter the length of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Please enter the elements of the arr2:");
        for(int i = 0; i < n2; i++){
            int a = sc.nextInt();
            arr2[i] = a;
        }
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    flag  = true;
                    count++;
                }
            }
        }
        if(count == n2){
            System.out.println("Array 2 is a subset of Array 1.");
        }
        else{
            System.out.println("Array 2 is not subset of Array 1.");
        }
        
    }
}