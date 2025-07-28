//Assignment Task 02: Row Rotation Policy
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        //For this task you don"t need to create new arrays
        //After rotation the Matrix should be printed inside the method
        //Only the integer row number is to be returned

        //TO DO
        examWeek = examWeek - 1;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < col; i++){
            int upper = 0;
            int lower = row - 1;
            while(upper < lower){
                String temp = matrix[upper][i];
                matrix[upper][i] = matrix[lower][i];
                matrix[lower][i] = temp;
                upper++;
                lower--;
            }
            int sec_upper = 0;
            int sec_lower = examWeek - 1;
            while(sec_upper < sec_lower){
                String temp = matrix[sec_upper][i];
                matrix[sec_upper][i] = matrix[sec_lower][i];
                matrix[sec_lower][i] = temp;
                sec_upper++;
                sec_lower--;
            }
            int third_upper = examWeek;
            int third_lower = row - 1;
            while(third_upper < third_lower){
                String temp = matrix[third_upper][i];
                matrix[third_upper][i] = matrix[third_lower][i];
                matrix[third_lower][i] = temp;
                third_upper++;
                third_lower--;
            }
        }
        Arr.print2D(matrix);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j].equals("AA")){
                    return j + 1;
                }
            }
        }
        return null;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}