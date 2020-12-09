public class Shufflecheck {
    static boolean shuffcheck(String f, String s, String shuff)
    {
        if(f.length()+s.length()!=shuff.length())
        {
            return false;
        }
        int i=0;int j =0; int k =0;
        while(k!=shuff.length())
        {
            if(i<f.length() && shuff.charAt(k) == f.charAt(i))
            {
                i++;
            }
            else if(j<s.length() && s.charAt(j) == shuff.charAt(k))
            {
                j++;
            }
            else
            {
                return false;
            }
            k++;
        }
        if(i < f.length() && j < s.length())
            return false;
        
        return true;
    }
    
    
    
    public static void main(String args[])
    {
        String f = "xyz";
        String s = "up";
        String[] shuf = {"xyupz","xyzpu"};
        for(int i =0 ; i<shuf.length;i++)
        {
            if(shuffcheck(f,s,shuf[i]) == true)
            {
                System.out.print("Valid Shuffle \n");
            }
            else{
                System.out.print("Not a valid shuffle");
            }
        }
    }
    
}
