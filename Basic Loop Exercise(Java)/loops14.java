public class loops14 {
    public static void main(String[] args) {
        int i = 3; // Start from the third term
        int first_term = 0;
        int second_term = 1;
        
        // Print the first two terms explicitly
        System.out.print(first_term + " " + second_term + " ");
        
        while (i <= 50) {
            int sum = first_term + second_term;
            System.out.print(sum + " ");
            first_term = second_term;
            second_term = sum;
            i++;
        }
    }
}
