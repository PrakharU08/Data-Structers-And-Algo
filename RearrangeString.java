import java.util.*;
public class RearrangeString {
    public static void main(String args[])
    {
        String s ="aaabc";
        Map<Character,Integer> count = new HashMap<>();
        for(Character p :s.toCharArray())
        {
            count.put(p,count.getOrDefault(p,0)+1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)->count.get(b)-count.get(a));
        maxheap.addAll(count.keySet());
        StringBuilder res = new StringBuilder();
        while(maxheap.size()>1)
        {
            char currrent = maxheap.remove();
            char next = maxheap.remove();
            res.append(currrent);
            res.append(next);
            count.put(currrent,count.get(currrent)-1);
            count.put(next,count.get(next)-1);
            if(count.get(currrent)>0)
            {
                maxheap.add(currrent);
            }
            if(count.get(next)>0)
            {
                maxheap.add(next);
            }
        }
        if(!maxheap.isEmpty())
        {
            char last = maxheap.remove();
            if(count.get(last)>1)
            {
                System.out.print("");
            }
            res.append(last);
        }
        System.out.print(res.toString());


    }
    
}
