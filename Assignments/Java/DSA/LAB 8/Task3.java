public class Task3 {
    public static int[] machine_loads(int[] times, int m) {
        MinHeap heap = new MinHeap(m);
        for (int i = 0; i < m; i++) {
            heap.insert(0);
        }
        for (int i = 0; i < times.length; i++) {
            int smallest_load = heap.extractMin();
            smallest_load = smallest_load + times[i];
            heap.insert(smallest_load);
        }
        int[] ans = new int[m];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = heap.extractMin();
        }
        return ans;
    }
}
