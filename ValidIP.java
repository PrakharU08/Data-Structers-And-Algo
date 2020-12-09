import java.util.ArrayList;
import java.util.List;

public class ValidIP {
    public static List<String> check(String str)
    {
        List<String> res = new ArrayList<>();
        for(int i=1;i<str.length()&& i<4;i++)
        {
            String first = str.substring(0,i);
            if(!isvalid(first))
            {
                continue;
            }
            for(int j =1; i+j<str.length() && j<4;j++)
            {
                String second = str.substring(i,i+j);
                if(!isvalid(second))
                {
                    continue;
                }
                for(int k=1;i+j+k<str.length();k++)
                {
                    String third = str.substring(i+j,i+j+k);
                    String fourth = str.substring(i+j+k);
                    if(!isvalid(third) || !isvalid(fourth))
                        continue;
                    res.add(first +"."+ second + "."+third+"."+fourth);
                }
            }
        }
        
        return res;
    }
    public static boolean isvalid(String s)
    {
        if(s.length()>3)
            return false;
        if(s.startsWith("0") && s.length()>1)
            return false;
        int val = Integer.parseInt(s);
        if(val>255)
        {
            return false;
        }
        return true;
    }
    
    public static void main (String args[])
    {
        List<String> a = new ArrayList<>();
        String b = "25505011535";
        a = check(b);
        System.out.println(a.toString());
    }
    
}
