import java.util.*;
public class  TripletSum {
    public static void main(String args[])
    {
        int[] arr1 = {4,4,1,6,11,22,4,5,6};
        int sum = 9;
        Arrays.sort(arr1);
        int len = arr1.length;

        for (int i=0;i<len;i++)
        {
            int start = i+1;
            int end = len-1;
            while(start<end)
            {
                if(arr1[i]+arr1[start]+arr1[end] == sum)
                {
                    System.out.println("The triplets are = "+arr1[i]+","+arr1[start]+","+arr1[end]);
                    break;
                }
                else if(arr1[i]+arr1[start]+arr1[end] < sum)
                start++;
                else
                {
                    end--;
                }
            }
        }
        
    }
}
