public class ThreeWayPartition {
    public static void main(String args[])
    {
        int[] arr = {1,2,6,7,8,10,19,27,19,45,23};
        int lowval = 19;
        int greatval = 27;
        int start = 0;
        int end = arr.length-1;
        int i =0;
        while(i<=end)
        {
            if(arr[i]<lowval)
            {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            }
            else if(arr[i] > greatval) 
            { 
                  
                int temp = arr[end]; 
                arr[end] = arr[i]; 
                arr[i] = temp; 
                end--;       
            } 
            else
            {
                i++;
            }
        }
        for(int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }

    }
    
}
