public class task9 {
    public static void main(String[] args) {
        int [ ] [ ] A = {{1,  0,  0,  1},
                       {0,  1,  0,  0},
                       {1,  0,  1,  0},
                       {0,  1,  0,  1}};


        boolean flag = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j && A[i][j] != 1) {
                    flag = false;
                } else if (i != j && A[i][j] != 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}