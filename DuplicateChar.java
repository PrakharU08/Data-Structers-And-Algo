import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    
    static void FindDup(String a) {
        Map<Character,Integer> map = new HashMap<>();
        char[] atoarray = a.toCharArray();
        for(char c : atoarray)
        {
            if(!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else 
            {
                map.put(c, map.get(c)+1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) 
        {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+": "+entry.getValue()+" ");
            }
        }


    }

    public static void main(String args[]) {
        /*
         * String a = "geeksforgeeks"; for(int i =a.length()-1;i>=0;i--) {
         * System.out.print(a.charAt(i)); }
         */
        String a = "prakhar";
        FindDup(a);


    }
    
}
