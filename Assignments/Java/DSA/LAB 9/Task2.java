public class Task2 {
    //Task2a
    public static int maxEdgeSumAM(GraphMatrix g){
        int[][] arr = g.adjMatrix;
        int[][] max = new int[1][2];
        max[0][0] = 0;
        max[0][1] = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            if(sum > max[0][0]){
                max[0][0] = sum;
                max[0][1] = i; 
            }
        }
        return max[0][1];
    }

    //Task2b
    public static int maxEdgeSumAL(Graph g){
        Node[] arr = g.adjList;
        int max = 0;
        int maxVertex = 0;
        for(int i = 0; i < arr.length; i++){
            Node temp = arr[i];
            int sum = 0;
            while(temp != null){
                sum = sum + temp.weight;
                temp = temp.next;
            }
            if(sum > max){
                max = sum;
                maxVertex = i;
            }
        }
        return maxVertex;
    }
}
