public class Task3 {
    //Task3a
    public int maxDegreeDWAM(GraphMatrix g){
        int arr[][] = g.adjMatrix;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > 0){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public int maxSumVDWAM(GraphMatrix g){
        int arr[][] = g.adjMatrix;
        int max = 0;
        int maxVertex = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
                maxVertex = i;
            }
        }
        return maxVertex;
    }

    //Task3b
    public int maxDegreeDWAL(Graph g){
        Node[] list = g.adjList;
        int max = 0;
        for(int i = 0; i < list.length; i++){
            int count = 0;
            Node temp = list[i];
            while(temp != null){
                count++;
                temp = temp.next;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public int maxSumVDWAL(Graph g){
        Node[] list = g.adjList;
        int max = 0;
        int maxVertex = 0;
        for(int i = 0; i < list.length; i++){
            int sum = 0;
            Node temp = list[i];
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
