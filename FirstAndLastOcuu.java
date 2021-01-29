import java.util.*;
public class FirstAndLastOcuu {
    public static void main(String args[])
    {
        int arr[] = {1,5,5,5,3,5,67,1213,125};
        int k = 67;
        Arrays.sort(arr);
        int start =0;
        int beg=0;
        int end =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == k)
            {
                if(start == 0)
                {
                    beg = i;
                    start++;
                }
                end = i;
            }
        }
        System.out.print(beg+ " " +end);
        
    }
    
}
