public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        GraphMatrix gm = new GraphMatrix(4);

        g.add(0, 1, 5);
        g.add(0, 2, 4);
        g.add(3, 1, 6);
        g.add(3, 2, 7);

        gm.addMat(0, 1, 5);
        gm.addMat(0, 2, 4);
        gm.addMat(3, 1, 6);
        gm.addMat(3, 2, 7);

        g.printGraph();
        gm.printGraph();

        System.out.println(g.maxDegree());
        System.out.println(gm.maxDegree());

        System.out.println("Vertex whose sum of edge weights is maximum: " + Task2.maxEdgeSumAM(gm));
        System.out.println("Vertex whose sum of edge weights is maximum: " + Task2.maxEdgeSumAL(g));
        
        Task4.undirectedWGAL(g);
        g.printGraph();
        Task4.undirectedWGAM(gm);
        gm.printGraph();
    }
}
