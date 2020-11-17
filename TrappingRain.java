public class TrappingRain {
    public static void main(String args[])
    {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2};
        int sum = 0;
        int left = 0;
        int right =0;
        for(int i=0;i<arr.length;i++)
        {
            left = arr[i];
            for(int j=0;j<i;j++)
            {
                left = Math.max(left, arr[j]);
            }
            right = arr[i];
            for(int j = i+1;j<arr.length;j++)
            {
                right = Math.max(right,arr[j]);
            }
            sum = (sum + Math.min(left ,right))-arr[i];
        }
        System.out.println(sum);
    }
    
}
