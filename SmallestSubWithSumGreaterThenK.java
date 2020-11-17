public class SmallestSubWithSumGreaterThenK {
   public static void main(String args[])
    {
        int[] arr = {2,6,1,5,4};
        int k =11;
        int min_len = arr.length-1;
        for (int start = 0;start<arr.length;start++)
        {
            int cur_sum = arr[start];
            if(cur_sum>k)
            {
                System.out.print("Smallest sub array: 1") ;
            }
            for(int end = start+1;end<arr.length;end++)
            {
                cur_sum = cur_sum + arr[end];
                if(cur_sum>k && end-start+1<min_len )
                {
                    min_len = end-start+1;
                }
            }
        }
        System.out.print(min_len);
    } 
    
}
