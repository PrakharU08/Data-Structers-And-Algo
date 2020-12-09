import java.util.*;

public class SmallestWindowDistinct {
    public static void main(String args[])
    {
        String st = "aaab";
        Map<Character,Integer> ma = new HashMap<>();
        
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<st.length();i++)
            set.add(st.charAt(i));
        int n = set.size(); 
        
        List<Character> aList = new ArrayList<Character>(n); 
        for (Character x : set) 
            aList.add(x);
        
        for(int i=0;i<aList.size();i++)
        {
            ma.put(aList.get(i),0);
        }    
        int lenofdist = set.size();
        int i=0;
        int j=1;
        ma.put(st.charAt(i), 1);
        int count =0;
        count++;
        int min =Integer.MAX_VALUE;
        while(i<=j && j<st.length())
        {
            if(count<lenofdist)
            {   
                if(ma.get(st.charAt(j))==0) count++; 
                int c = ma.containsKey(st.charAt(j)) ? ma.get(st.charAt(j)) : 0;
                ma.put(st.charAt(j), c + 1);
                j++;
                //System.out.println(count);
            }
            else if(count==lenofdist)
            {
                int currentWalls = ma.get(st.charAt(i));
                min = Math.min(min, j-1);
                if(ma.get(st.charAt(i))==1) count--;
                ma.put(st.charAt(i), currentWalls-1);
                i++;
                //int m = ma.get(st.charAt(i));
                //min = Math.min(min, i-j);
                //if(ma.get(st.charAt(i))==1) count--;
                //m--;
                //i++;
            }
            //System.out.println(ma);
        }
        while(count ==lenofdist)
        {
            int currentWalls = ma.get(st.charAt(i));
            min = Math.min(min, j-i);
            if(ma.get(st.charAt(i))==1) count--;
            ma.put(st.charAt(i), currentWalls-1);
            i++;
            //System.out.println(ma);
        }
        System.out.print(min);
        
        

    }
}
