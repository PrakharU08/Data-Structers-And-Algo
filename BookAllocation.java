import java.util.Arrays;

public class BookAllocation {
    
    public static boolean isvalid(int[] arr,int n,int k,int mid)
    {
        int stu = 1;
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            sum = sum+arr[i];
            if(sum>mid)
            {
                stu++;
                sum = arr[i];
            }
            if(stu>k)
               return false;
        }
        return true;
    }
    
    
    
    public static void main(String args[])
    {
        int arr[] = {15,17,20};
        int k = 2;
        int n = arr.length;
        if(arr.length<k)
            System.out.print("Not Possible");
        else
        {
            int sum = 0;
            Arrays.sort(arr);
            int start = arr[n-1];
            for(int i =0;i<n;i++)
            {
                sum = sum+arr[i];
            }
            int end = sum;
            int res = -1;
            while(start<=end)
            {
                int mid = (start+end)/2;
                if(isvalid(arr,n,k,mid) == true)
                {
                    res = mid;
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            if(res==-1)
                System.out.println("NotFound");
            else
                System.out.print(res);
        }
    }
    
}
