public class SearcgingInAnArray {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,6,7,9};
        int k = 2;
        int x = 4;
        int ans =0;
        for(int i =0;i<arr.length;)
        {
            if(arr[i]==x)
            {
                System.out.println("The index is:" +i);
                break;
            }
            i = i+Math.max(1,Math.abs(x-arr[i])/k);
        }
        
    }
    
}
