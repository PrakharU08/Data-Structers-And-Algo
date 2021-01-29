public class swapsort {
    public static void main(String args[])
    {
        int arr[] = {2,3,1,5,1,2};
        int size = arr.length;
        int i =0;
        while(i<5)
        {
            if(arr[i] != arr[arr[i]-1])
            {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
        for(int m =0;m<size;m++)
        {   if(arr[m] != m+1)
            {
                System.out.println("The missing number is :" +(m+1));
                System.out.println("The duplicate number is : " +(arr[m]));
            }
        }
        
    }
    
}
