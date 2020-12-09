public class LongestPallindromicSubaarrayBruteForce {

    public static String substrings(String s)
    {
        int start =0;
        int end =0;
        
        for(int i=0;i<s.length()-2;i++)
        {
            int len1=expandfrommiddle(s,i,i);
            int len2 = expandfrommiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len>end-start)
            {
                start = i - ((len-1)/2);
                end = i+(len/2);
            }

        }
        return s.substring(start,end+1);
    }    
    
    
    
    public static int expandfrommiddle(String s,int left,int right)
    {   
        if(s.length()==0)
            return 0;
        while(left>=0 && right<=s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String args[])
    {
        String s = "pracecaraa";
        String p = substrings(s);
        System.out.print(p);
        
    }
}