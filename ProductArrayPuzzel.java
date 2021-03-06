public class ProductArrayPuzzel {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4};
        int[] left = new int[4];
        int[] right = new int[4];
        int[] output = new int[4];
        left[0] = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            left[i] = left[i-1]*arr[i];
        }
        right[arr.length-1] = arr[3];
        for(int i =arr.length-2;i>=0;i--)
        {
            right[i] = right[i+1]*arr[i];
        }
        for(int i =0;i<arr.length;i++)
        {
            if(i==0)
            {
                output[0] = right[1];
            }
            else if(i == arr.length-1)
            {
                output[arr.length-1] = left[left.length-1];
            }
            else
            {
                output[i] = left[i-1]*right[i+1];
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(output[i]);
        }
    }
    
}
