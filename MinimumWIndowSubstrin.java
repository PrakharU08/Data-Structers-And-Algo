import java.util.*;
public class MinimumWIndowSubstrin {
    public static void main(String args[])
    {
        String str1 = "prakhargmnnohr";
        String str2 = "hr";
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i<str2.length();i++)
        {
            char s = str2.charAt(i);
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        int matchcount =0;
        int desiredmatchcount =str2.length();

        String ans = "";
        int i= -1;
        int j= -1;
        while(true)
        {
            boolean f1 =false;
            boolean f2 =false;
            //Acquire
            while(matchcount<desiredmatchcount && i<str1.length()-1)
            {
                i++;
                char p = str1.charAt(i);
                map1.put(p, map1.getOrDefault(p,0)+1);
                if(map1.getOrDefault(p, 0)<=map2.getOrDefault(p, 0))
                {
                    matchcount++;
                }
                f1 =true;
            }
            //Collect Answer and Release
            while(j<i && desiredmatchcount == matchcount)
            {
                String potentialans = str1.substring(j+1,i+1);
                if(ans.length() ==0 || potentialans.length()<ans.length())
                    ans = potentialans;
                //Release
                j++;
                char ch = str1.charAt(j);
                if(map1.get(ch) == 1)
                    map1.remove(ch);
                else
                    map1.put(ch, map1.get(ch)-1);
                if(map1.getOrDefault(ch, 0)<map2.getOrDefault(ch, 0))
                    matchcount--;
                f2 =true;
            }
            if(f1 == false && f2 == false)
            {
                System.out.print(ans);
                break;
            }
        }

    }
    
}
