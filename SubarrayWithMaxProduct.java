public class SubarrayWithMaxProduct {
    public static void main (String args[])
    {
        int[] arr = {-2,-3,4,-2};
        int max_enditng_here = arr[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min_ending_her = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                max_enditng_here =1;
                min_ending_her =1;
                continue;
            }
            int temp = max_enditng_here;
            max_enditng_here = Math.max(Math.max(arr[i], max_enditng_here * arr[i]),min_ending_her * arr[i]);
            //System.out.println(max_enditng_here);
            min_ending_her = Math.min(Math.min(arr[i],temp*arr[i]),arr[i]*min_ending_her);

            if(max<max_enditng_here)
            {
                max = max_enditng_here;
            }

        }
        System.out.println(max);
    }
    
}
