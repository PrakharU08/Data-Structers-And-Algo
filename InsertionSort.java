public class InsertionSort
{
    public static void main(String[] args) {
        int arr[] = {7,2,4,1,5,3};
        for(int i =0;i<arr.length;i++)
        {
            int k = i-1;
            int value = arr[i];
            while(k>=0 && arr[k]>arr[i])
            {
                arr[k+1] = arr[k];
                k= k-1;
            }
            

        }
 
    }
}