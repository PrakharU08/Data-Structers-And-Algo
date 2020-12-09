public class Flips
{
    public static void main(String args[])
    {
        int c1 =0;
        int c2 =0;
        String a = "0010110010";
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0 && a.charAt(i)=='1') c1++;
            if(i%2!=0 && a.charAt(i) =='0' ) c1++;
            if(i%2==0 && a.charAt(i)=='0') c2++;
            if(i%2!=0 && a.charAt(i) =='1' ) c2++;
        }
        int best = Math.min(c1, c2);
            System.out.print(best);
    }
}