public class MinSwapForBracketBalancing {
    public static void main(String args[])
    {
        String str = "[]][][";
        int open =0;
        int close =0;
        int swap =0;
        int res =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='[')
            {
                open++;
                if(res>0)
                {
                    swap +=res;
                }
                res--;
            }
            else
            {
                close++;
                res = close-open;
            }
        }
        System.out.print(swap);
    }
    
}
