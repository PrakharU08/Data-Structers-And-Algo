public class SplitString {
    public static void main(String args[])
    {
        String a = "0100110101";
        int count0 = 0;
        int count1 = 0;
        int cnt = 0;
        for(int i =0;i<a.length();i++)
        {
            if(a.charAt(i)== '0')
            {
                count0++;
            }
            else
            {
                count1++;
            }
            if(count0==count1)
            {
                cnt++;
            }
        }
        System.out.print("substrings with equal number of 0s and 1s is "+cnt);
    }
    
}
