package GraphStructure;

import java.util.*;

class GraphMain
{//
    static HashMap<Object, List<Object>> map = new HashMap<>();
    static HashMap<Object,Boolean> visited = new HashMap<>();

    void addEdges(Object startVertex,Object endvertex,boolean bidirectional)
    {
        if(!map.containsKey(startVertex))
        {
            map.put(startVertex, new LinkedList<Object>());
            visited.put(startVertex, false);
        }

        if(!map.containsKey(endvertex))
        {
            map.put(endvertex, new LinkedList<Object>());
            visited.put(endvertex,false);
        }

        map.get(startVertex).add(endvertex);

        if(bidirectional)
        {
            map.get(endvertex).add(startVertex);
        }



    }

    static boolean dfs_uti(Object source,Object parent)
    {
        visited.put(source,true);
        List abc = map.get(source);
        for(int i = 0;i<abc.size();i++)
        {
            if(visited.get(abc.get(i))==false)
            {
                if(dfs_uti(abc.get(i), source)==true) return true;
            }
            else if(abc.get(i)!=parent) return true;
        } 
        return false;
    }
    
    
    void dfs(Object source)
    {
        visited.put(source,true);
        System.out.println(dfs_uti(source,-1)); 
    }
}
public class CycleInUndirectedGraphUsingDfs {
    public static void main(String[] args) {
        GraphMain obj = new GraphMain();
        obj.addEdges(1, 5, true);
        obj.addEdges(5, 6, true);
        obj.addEdges(6, 7, true);
        obj.addEdges(7, 8, true);
        obj.addEdges(8, 5, true);
        // obj.addEdges(5, 6, true);

        obj.dfs(1);
        
    }
    
}
