public class MergeOperationForPallindrome {
    public static void main(String args[])
    {
        int[] arr = {1,5,6,9,19,21,1};
        int start = 0;
        int ans = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            if(arr[start] == arr[end])
            {
                start++;
                end--;
            }
            else if(arr[start]>arr[end])
            {
                start++;
                arr[start] = arr[start] +arr[start-1];
                ans++;
            }
            else
            {
                end--;
                arr[end] = arr[end]+arr[end+1];
                ans++;
            }
        }
        System.out.print("The number of merge operation required are:" +ans);
    }
    
}
