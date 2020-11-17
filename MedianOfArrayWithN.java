public class MedianOfArrayWithN {
    public static void main(String args[])
    {
        int arr[] = {2,4,6,8,10};
        int arr1[] = {1,5,9,11,12};
        int start_a = 0;
        int end_a = arr.length-1;
        int start_b = 0;
        int end_b = arr1.length-1;
        double median = findmedian(arr,arr1,start_a,start_b,end_a,end_b);  
        System.out.print(median);
    }

    public static double findmedian(int[] arr,int[] arr1,int start_a,int start_b,int end_a,int end_b) {
        if ((end_a-start_a == 1) && ((end_b-start_b ==1)))
        {
            return (1.0*(Math.max(arr[start_a],arr1[start_b])+Math.min(arr[end_a],arr1[end_b])))/2;
        }
        
        int m1_index = (start_a+end_a)/2;
        int m2_index = (start_b+end_b)/2;

        int m1 = arr[m1_index];
        int m2 = arr1[m2_index];

        if(m1 == m2)
        {
            return m2;
        } 
        if(m1<m2)
        {
            start_a = m1_index;
            end_b = m2_index;
        }
        else
        {
            start_b = m2_index;
            end_a = m1_index;
        }

        return findmedian(arr,arr1,start_a,start_b,end_a,end_b);
    }
    
    
    
}



