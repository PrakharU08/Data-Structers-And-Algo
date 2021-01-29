public class SqaureRootBinarySearch {
    
    public static double squaroot(int n,int p)
    {
        int start =0;
        int end = n;
        double ans =0 ;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(mid*mid == n)
            {
                ans = mid;
                break;
            }
            if(mid*mid<n)
            {
                start = mid+1;
                ans = mid;
            }
            else
            {
                end = mid-1;
                //ans = mid;
            }
        }

        double inc = 0.1;
        //Fraction Part
        for(int i =0;i<p;i++)
        {
            while(ans*ans<=n)
            {
                ans = ans+inc;
            }
            ans = ans-inc;
            inc = inc/10;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.print(squaroot(5,6));
    }
    
}