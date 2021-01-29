public class SearchInRotatedArray {
    
    //This code is for finding number of rotation done to make an array sorted
    public static void BinarySearch(int[] arr, int start, int end,int ele)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == ele)
            {
                System.out.println("The element is present at " +mid);
            }
            if(arr[mid]>=ele)
            {
                end = mid-1;
            }
            if(arr[mid]<=ele)
            {
                start = mid+1;
            }
        }
    }    
        public static void main(String args[])
    {
        //2,5,6,7,8,9,11
        //6,7,8,9,11,2,5
        
        int arr[] = {15, 18, 2, 3, 6, 12};
        int start = 0;
        int ele = 12;
        int end = arr.length-1;
        int N = arr.length;
        int index;
        while(start<=end)
        {
            int mid = (start+end)/2;
            int next = (mid+1)%N;
            int prev = (mid+N-1)%N;
            
            if (mid < end && arr[mid+1] < arr[mid]) 
                System.out.print("The number of times the array rotated is :" +(mid+1));
                 
            
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
            {
                index = mid;
                //System.out.print("The number of times the array rotated is  :" +mid);
                BinarySearch(arr,start,index-1,ele);
                BinarySearch(arr,index,end,ele);
            }
            if(arr[start] <= arr[mid])
            {
                start = mid+1;
            }
            else if(arr[mid]<=arr[end])
            {
                end = mid-1;
            }
        }
    }    
}
