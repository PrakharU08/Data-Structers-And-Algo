package GraphStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class visited
{
    static HashMap<Object,Boolean> visited = new HashMap<>();
}

class Graph1
{
    static visited obj = new visited();
    static HashMap<Object,Boolean> visited = obj.visited;

    // static HashMap<Object,Boolean> visited = new HashMap<>();
    void addEdges(HashMap<Object, List<Object>> map, Object StartVertex,Object EndVertex)
    {
    
        if(!map.containsKey(StartVertex))
        {
            map.put(StartVertex,new LinkedList<>());
            visited.put(StartVertex, false);
        }

        if(!map.containsKey(EndVertex))
        {
            map.put(EndVertex,new LinkedList<>());
            visited.put(EndVertex, false);
        }

        map.get(StartVertex).add(EndVertex);
        map.get(EndVertex).add(StartVertex);
    }


    void bfs(HashMap<Object, List<Object>> map,Object Source)
    {
        Queue<Object> q = new LinkedList<>();
        q.add(Source);
        
        visited.put(Source,true);

        while(!q.isEmpty())
        {
            Object node = q.peek();
            System.out.println(node);
            q.poll();

            List<Object> abc = map.get(node);

            for(int i =0;i<abc.size();i++)
            {
                if(visited.get(abc.get(i))==false)
                {
                    q.add(abc.get(i));
                    visited.put(abc.get(i),true);
                }
            }
        }
            // for(Object neigh  : abc.size())
            // {
            //     if(visited.get(neigh)==false)
            //     {
            //         q.add(neigh);
            //         visited.put(neigh, true);
            //     }
            // }

}


    // void printGraph()
    // {
    //   for (Object vertex: visited.keySet()) {
    //     String key = vertex.toString();
    //     String value = visited.get(vertex).toString();
    //     System.out.println(key + " -->" + value);
    //   }
    // }
}



public class Bfs
{
    public static void main(String[] args) {
        HashMap<Object,List<Object>> map = new HashMap<>();
        Graph1 obj = new Graph1();
        obj.addEdges(map,1,2);
        obj.addEdges(map,1,3);
        obj.addEdges(map,2,5);
        obj.addEdges(map,2,4);
        obj.addEdges(map,3,5);
        obj.addEdges(map,4,5);
        obj.addEdges(map,5,6);
        obj.addEdges(map,4,6);
        obj.bfs(map,1);

        // obj.printGraph();

    }
}

// class Solution
// {
//     //Function to return Breadth First Traversal of given graph.
//     public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
//     {
//         boolean[] v = new boolean[V];
//         Queue<Integer> q = new LinkedList<>();
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         q.add(0);
//         v[0] = true;
//         // System.out.print(adj.get(0).get(1));
//         while(!q.isEmpty())
//         {
//             int node = q.poll();
//             res.add(node);
//             v[node] = true;
            
//             ArrayList<Integer> Node = adj.get(node);
//             for(int i =0;i<Node.size();i++)
//             {
//                 if(v[Node.get(i)]!=true)
//                 {
//                     q.add(Node.get(i));
//                     v[Node.get(i)] = true;
//                 }
//             }
            
//         }
        
//         return res;
        
//     }
// }