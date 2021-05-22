package GraphStructure;

import java.util.*;

public class DFS {
    public static HashMap<Object,List<Object>> map = new HashMap<>();
    static Graph1 obj = new Graph1();
    static visited obj1  = new visited();

    static void dfs(Object source)
    {
        obj1.visited.put(source, true);
        dfs_util(source);
        
    }

    static void dfs_util(Object source)
    {
        System.out.println(source);
        List abc = map.get(source);
        for(int i =0;i<abc.size();i++)
        {
            if(obj1.visited.get(abc.get(i))==false)
            {
                obj1.visited.put(abc.get(i), true);
                dfs_util(abc.get(i));
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        obj.addEdges(map,1, 2);
        obj.addEdges(map,1, 3);
        obj.addEdges(map,2, 4);
        obj.addEdges(map,3, 4);
        obj.addEdges(map,3, 5);
        obj.addEdges(map,5, 6);
        dfs(1);
    }
}
