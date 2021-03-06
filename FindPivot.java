public class FindPivot {
    
    public static int binary(int arr[])
    {
        if(arr[0]<arr[arr.length-1])
            return 0;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
            {
            int mid = (start + end)/2;

            if(arr[mid]>arr[mid+1])
                return(arr[mid+1]);

            else if(arr[mid]<=arr[end])
                end = mid-1;
            else
                start = mid+1;
            }
        
        return 0;
    }
    
    
    public static void main(String args[])
    {
        int arr[] = {73,85,94,21,27,34,46,54,66};
        System.out.print(binary(arr));
    }
    
}
