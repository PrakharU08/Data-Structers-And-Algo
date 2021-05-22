package GraphStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
    Object source;
    Object parent;
    Node(Object source,Object parent)
    {
        this.source = source;
        this.parent = parent;
    }
}




public class CycleInUndirectedGraphUsingBfs {

    static HashMap<Object, List<Object>> map = new HashMap<>();
    static HashMap<Object,Boolean> visited = new HashMap<>();

    static void addEdges(Object startVertex,Object endvertex,boolean bidirectional)
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

    static boolean cyclicbfs_util(Object source,Object parent)
    {
        
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(source, -1));
        
        while(!q.isEmpty())
        {
            Object cur = q.peek().source;
            Object par = q.peek().parent;
            q.poll();
            List<Object> abc = map.get(cur);
            for(int i =0;i<abc.size();i++)
            {
                if(!visited.get(abc.get(i)))
                {
                    q.add(new Node(abc.get(i),cur));
                    visited.put(abc.get(i), true);
                }
                else if(par != abc.get(i))
                    return true;
            }   
        }
        return false;
        
        // for(int i =0;i<abc.size();i++)
        // {

        // }

    }
    
    
    static void cyclicbfs(Object source)
    {
        visited.put(source,true);
        System.out.println(cyclicbfs_util(source,-1)); 
    }



    

    

    public static void main(String[] args) {
        GraphMain obj = new GraphMain();
        addEdges(1, 0, true);
        addEdges(1, 2, true);
        addEdges(2, 0, true);
        addEdges(0, 3, true);
        addEdges(3, 4, true);
        // addEdges(10, 9, true);
        // addEdges(9,8, true);
        cyclicbfs(1);
    }
    
}
