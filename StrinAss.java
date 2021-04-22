import java.util.HashMap;
import java.util.*;

public class StrinAss {
    
    public static String checkstring(String test)
    {
        /*
        
        String str = "";
        int count=1;
        int p =0;
        for(int i =0;i<test.length();i++)
        {
            if(p<test.length()-1)
                p = p+1;
            char a = test.charAt(i);
            char b = test.charAt(p);
            if(a==b)
                count++;
            else
            {
                str = str +a;
                str = str + count;
                //str = str +b;
                //str = str + count;

                count =1;     
            }
        }
        return str;
    */
        HashMap<Character,Integer> ma = new HashMap<>();
        for(char c : test.toCharArray() )
        {
            ma.put(c, ma.getOrDefault(c, 0) + 1);
        }
        for (Object objectName : ma.keySet()) {
            System.out.print(objectName);
            System.out.print(ma.get(objectName));
          }

        return "";

    }
      
    public static void main(String args[])
    {
        String abc = checkstring("AAAABBBCCC");
        System.out.print(abc);
    }
    
}
