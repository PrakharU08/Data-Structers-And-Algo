import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortAnArrayWithMinSwap {
    public static int minswap(int arr[])
    {
        int ans = 0;
        int temp[] = Arrays.copyOfRange(arr, 0,arr.length);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        Arrays.sort(temp);
        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=temp[i])
            {
                int init = arr[i];
                ans++;
                swap(arr,i,map.get(temp[i]));

                map.put(init,map.get(temp[i]));
            }
        }

        
        
        return ans;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 5, 4, 3, 2};
        System.out.print(minswap(arr));
    }
    
}
