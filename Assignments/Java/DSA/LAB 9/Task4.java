public class Task4 {
    //Task4a
    public static void undirectedWGAM(GraphMatrix g){
        for(int i = 0; i < g.adjMatrix.length; i++){
            for(int j = 0; j < g.adjMatrix[0].length; j++){
                g.adjMatrix[j][i] = g.adjMatrix[i][j];
            }
        }
    }

    //Task4b
    public static void undirectedWGAL(Graph g){
        Node[] list = g.adjList;
        boolean[][] visited = new boolean[g.vertices][g.vertices];
        for(int src = 0; src < list.length; src++){
            Node current = list[src];
            while(current != null){
                int weight = current.weight;
                int destination = current.vertex;
                if(visited[src][destination] == false && visited[destination][src] == false){
                    Node newNode = new Node(src, weight);
                    newNode.next = g.adjList[destination];
                    g.adjList[destination] = newNode;
                    visited[src][destination] = true;
                    visited[destination][src] = true;
                }
                current = current.next;
            }
        }
    }
}
