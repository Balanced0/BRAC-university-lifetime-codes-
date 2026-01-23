public class Task4 {
    public static int[] k_largest(int[] nums, int k){
        int[] ans = new int[k];
        MaxHeap heap = new MaxHeap(nums.length);
        for(int i = 0; i < nums.length; i++){
            heap.insert(nums[i]);
        }
        for(int i = 0; i < ans.length; i++){
            ans[i] = heap.extractMax();
        }
        return ans;
    }
}
