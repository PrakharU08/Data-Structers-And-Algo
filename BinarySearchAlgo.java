public class BinarySearchAlgo {
    

    public static int binarysearch(int[] arr,int l, int r,int x)
    {
        if(l<=r)
        {   int mid = (l+r)/2;
            if(arr[mid] == x)
            return mid;

            if(arr[mid]>x)
            {
                return binarysearch(arr,l,mid-1,x);
            }

            return binarysearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr = {1,5,9,16,20,24};
        int n = arr.length;
        int x = 20;
        int result = binarysearch(arr,0,n-1,x);
        if(result == -1)
        {
            System.out.println("Elementnot found");
        }
        else
        {
            System.out.print("Element found at index = " +result);
        }
    }
    
}
