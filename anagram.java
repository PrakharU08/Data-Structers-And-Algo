import java.util.*;
public class anagram {
    public static void main(String args[])
    {
        String[] str ={"cog","goc","car","rac"};
        List<List<String>> ana = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String current : str)
        {
            char[] charachter = current.toCharArray();
            Arrays.sort(charachter);
            String sorted = new String(charachter);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        ana.addAll(map.values());
        System.out.print(ana.toString());

    }
    
}
