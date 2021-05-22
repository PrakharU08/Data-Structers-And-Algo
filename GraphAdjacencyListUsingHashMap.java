import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// class Node3<T>
// {
//     Integer vertex = null;
//     Character weight = null;
//     Node3(Integer vertex,Character weight)
//     {
//         this.vertex = vertex;
//         this.weight = weight;
//     }
// }

// class graph<T>
// {
//     // HashMap<T,List<List<Integer,String>>> map = new HashMap<>();
// }

class GraphList
{
   char vertex;
   int weight;

   public GraphList(char vertex,int weight)
   {
     this.vertex = vertex;
     this.weight = weight;
   }

   public String toString(){
    return "[" + this.vertex + "," + this.weight+ "]";
    }
}

class Graph
{
  void add(HashMap<Character,LinkedList<GraphList>> map,char startvertex,char endvertex,int weight,boolean bidirectional)
  {
    //LinkedList<GraphList> ll = new LinkedList<>();
     
    if(!map.containsKey(startvertex))
      map.put(startvertex,new LinkedList<GraphList>());

    if(!map.containsKey(endvertex))
      map.put(endvertex, new LinkedList<GraphList>());

    map.get(startvertex).add(new GraphList(endvertex, weight));
    if(bidirectional)
    {
      map.get(endvertex).add(new GraphList(startvertex, weight));
    }
  }

  static void printGraph(HashMap<Character,LinkedList<GraphList>> map)
  {
    for (Character vertex: map.keySet()) {
      String key = vertex.toString();
      String value = map.get(vertex).toString();
      System.out.println(key + " -->" + value);
    }
  }
}


public class GraphAdjacencyListUsingHashMap {
  
  
  public static void main(String[] args) {
        // ArrayList<Node3<Object>> abj = new ArrayList<Node3<Object>>();
        // abj.add(new Node3(13,'B'));
        
        // Iterator<Node3<Object>> iter= abj.iterator();
        // while (iter.hasNext()) {
        //     System.out.print(iter.next() + " ");
        // }
        
        HashMap<Character,LinkedList<GraphList>> map = new HashMap<Character,LinkedList<GraphList>>();
        Graph obj = new Graph();

        
        obj.add(map,'A','B',20,true);
        obj.add(map,'A','D',28,false);
        obj.add(map,'A','C',38,true);
        obj.add(map,'C','D',18,true);

        obj.printGraph(map);

        

      
        
        // LinkedList<GroupOfFourInts> linky = new LinkedList<GroupOfFourInts>();
        // linky.add(new GroupOfFourInts(4,'b'));
        // linky.add(new GroupOfFourInts(6,'c'));
        // System.out.println(linky.getFirst());
        
        // for(GroupOfFourInts employee : linky)
        //     System.out.println( employee );
  
    }
}
