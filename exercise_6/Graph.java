public class Graph {
    class Edge {
        String src, dest;}
    int vertices, edges;
    Edge[] edge;

    Graph(int vertices, int edges) {
        
        this.vertices = vertices;
        this.edges = edges;
        
        edge = new Edge[edges];
        
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        
        int Vrtcs = 10;
        int Edgs = 10;
        Graph myGraph = new Graph(Vrtcs, Edgs);


        myGraph.edge[0].src = "Ivan";
        myGraph.edge[0].dest = "Jenive";


        myGraph.edge[1].src = "Ivan";
        myGraph.edge[1].dest = "Jezeil";


        myGraph.edge[2].src = "Ivan";
        myGraph.edge[2].dest = "Rommel";


        myGraph.edge[3].src = "Ivan";
        myGraph.edge[3].dest = "Jazel";
        
        
        myGraph.edge[4].src = "Ivan";
        myGraph.edge[4].dest = "Carries";
        
        
        myGraph.edge[5].src = "Ivan";
        myGraph.edge[5].dest = "Aldreen";
        
        
        myGraph.edge[6].src = "Aldreen";
        myGraph.edge[6].dest = "Yves";
        
        
        myGraph.edge[7].src = "Ivan";
        myGraph.edge[7].dest = "Andrei";
        
        
        myGraph.edge[8].src = "Ivan";
        myGraph.edge[8].dest = "Louie";
        
        
        myGraph.edge[9].src = "Louie";
        myGraph.edge[9].dest = "Rommel";
        
        

        
        
        for (int i = 0; i < Edgs; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
