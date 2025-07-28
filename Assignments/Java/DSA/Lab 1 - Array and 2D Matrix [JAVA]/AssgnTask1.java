//Assignment Task 01: Container with Most Water
class AssgnTask1 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater(Integer[] height) {

        // TO DO
        int max = 0;
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] < height[j] || height[i] == height[j]) {
                    int temp = (height[i]) * (j - i);
                    if (temp > max) {
                        max = temp;
                        ans = height[i] * height[i];
                    }
                } else if (height[i] > height[j] || height[i] == height[j]) {
                    int temp = (height[j]) * (j - i);
                    if (temp > max) {
                        max = temp;
                        ans = height[j] * height[j];
                    }
                }
            }
        }
        System.out.println(max);
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[] array = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
        System.out.print("\nYour Output:\n");
        mostWater(array);

    }
}
