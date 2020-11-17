public class MaxSumSubarray{
    public static void main(String args[])
    {
        int[] a = {2,1,8,9,7,0,2,-9};
        int maximymsubarraysum = -9999;
        for(int i=0;i<a.length;i++)
        {   int window =0;
            for(int j=i;j<a.length;j++)
            {
                window = window+a[j];
                maximymsubarraysum  = Math.max(maximymsubarraysum , window);
            }
        }
        System.out.println(maximymsubarraysum);
    }
}