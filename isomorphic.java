import java.util.HashMap;

public class isomorphic {
    
    public static boolean isiso(String str1,String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();

        for(int i=0;i<str1.length();i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(map1.containsKey(ch1) == true)
            {
                if(map1.get(ch1)!=ch2)
                    return false;
            }
            else
            {
                if(map2.containsKey(ch2) == true)
                    return false;
                else
                {
                    map1.put(ch1,ch2);
                    map2.put(ch2, true);
                }
            }
        }  
        return true;
    }
    
    public static void main(String args[])
    {
        String str1 = "acb";
        String str2 = "xxy";
        if(!isiso(str1,str2))
        {
            System.out.println("Not isomorphic");
        }
        else
        {
            System.out.println("Isomorphic");
        }

    }
    
}
