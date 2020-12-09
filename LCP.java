public class LCP {
    public static void main(String args[])
    {
        String a = "apple";
        String b = "appe";
        String c = "apr";
        int count =0;
        int min_len = Math.min(a.length(),Math.min(b.length(),c.length()));
        for(int i=0;i<min_len;i++)
        {
            if(a.charAt(i) == b.charAt(i) && b.charAt(i)== c.charAt(i))
            {
                count ++;
            }
            else break;
        }
        System.out.print(count);
    }
}
