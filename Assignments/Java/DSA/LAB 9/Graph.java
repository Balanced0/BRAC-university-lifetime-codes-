public class Graph {
    public int vertices;
    public Node[] adjList;
    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new Node[vertices];
    }
    public void add(int src, int des, int weight){
        Node newNode = new Node(des, weight);
        newNode.next = adjList[src];
        adjList[src] = newNode;
    }
    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.print("Vertex " + i + ": ");
            Node temp = adjList[i];
            while(temp != null){
                System.out.print(" --> " + temp.vertex);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public int maxDegree(){
        int max = 0; 
        for(int i = 0; i < adjList.length; i++){
            Node temp = adjList[i];
            int count = 0;
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
}
