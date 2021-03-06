public class EKOSPOJ {
    
    public static boolean isvalid(int[] arr,int mid,int k)
    {
        int woodcut =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>mid)
                woodcut = woodcut+(arr[i]-mid);
        }
        if(woodcut<k)
            return false;
        else
            return true;
    }
    
    
    
    public static void main(String args[])
    {
        int arr[] = {4,42,40,26,46};
        int k = 20;
        int ans = -1;
        int small = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>small)
            {
                small = arr[i];
            }
        }
        int start = 0;
        int end = small;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(isvalid(arr,mid,k)==true)
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
    
}
