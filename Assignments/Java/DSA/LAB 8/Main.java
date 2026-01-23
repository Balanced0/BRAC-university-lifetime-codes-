public class Main {
    public static void main(String[] args) {
        // Task 3
        int[] times = { 2, 4, 7, 1, 6 };
        int m = 4;
        int[] ans = Task3.machine_loads(times, m);
        System.out.print("[");
        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.print(ans[ans.length - 1]);
        System.out.print("]");
        System.out.println();

        // Task 4
        int[] nums = { 4, 10, 2, 8, 6, 7 };
        int k = 3;
        int[] result = Task4.k_largest(nums, k);
        System.out.print("[");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1]);
        System.out.print("]");
        System.out.println();
    }
}
