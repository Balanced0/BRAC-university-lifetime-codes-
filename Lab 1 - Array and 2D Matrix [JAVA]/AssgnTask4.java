//Assignment Task 04: Game Arena
class AssgnTask4 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame(Integer[][] arena) {

        // For this task you don't need to create any new 2D array
        // just print the result inside the function

        // TO DO
        int row = arena.length;
        int col = arena[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arena[i][j] % 50 == 0 && arena[i][j] >= 50) {
                    if ((i - 1) >= 0 && arena[i - 1][j] == 2) {
                        sum = sum + arena[i - 1][j];
                    }
                    if ((i + 1) <= row - 1 && arena[i + 1][j] == 2) {
                        sum = sum + arena[i + 1][j];
                    }
                    if ((j - 1) >= 0 && arena[i][j - 1] == 2) {
                        sum = sum + arena[i][j - 1];
                    }
                    if ((j + 1) <= col - 1 && arena[i][j + 1] == 2) {
                        sum = sum + arena[i][j + 1];
                    }
                }
            }
        }
        if (sum >= 10) {
            System.out.println("Points Gained: " + sum + ". Your team has survived the game.");
        } else {
            System.out.println("Points Gained: " + sum + ". Your team is out.");
        }
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] arena = {
                { 0, 2, 2, 0 },
                { 50, 1, 2, 0 },
                { 2, 2, 2, 0 },
                { 1, 100, 2, 0 }
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena);

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                { 0, 2, 2, 0, 2 },
                { 1, 50, 2, 1, 100 },
                { 2, 2, 2, 0, 2 },
                { 0, 200, 2, 0, 0 }
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena1);
    }
}