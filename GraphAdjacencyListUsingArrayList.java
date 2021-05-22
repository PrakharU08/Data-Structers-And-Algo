import java.util.ArrayList;

public class GraphAdjacencyListUsingArrayList {
    
    static void graph(ArrayList<ArrayList<Integer>> adj,int v1,int v2)
    {
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    static void printgraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i =0;i<adj.size();i++)
        {
            System.out.println("Vertex:" +i );
            for(int j =0;j<adj.get(i).size();j++)
            {
                System.out.print(" " + adj.get(i).get(j)+" -->");
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int vertex = 4;
        for(int i =0;i<vertex;i++)
        {
            adj.add(new ArrayList<>());
        }

        graph(adj, 0, 1);
        graph(adj, 0, 2);
        graph(adj, 1, 2);
        graph(adj, 2, 3);

        printgraph(adj);
    }
    
}
