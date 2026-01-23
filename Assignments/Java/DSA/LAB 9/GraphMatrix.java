public class GraphMatrix {
    public int vertices;
    public int[][] adjMatrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addMat(int src, int des, int weight) {
        adjMatrix[src][des] = weight;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[0].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int maxDegree(){
        int max = 0;
        for(int i = 0; i < adjMatrix.length; i++){
            int count = 0;
            for(int j = 0; j < adjMatrix[0].length; j++){
                if(adjMatrix[i][j] > 0){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
