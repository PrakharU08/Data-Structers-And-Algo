import java.util.*;
public class MedianOF2dArray
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{4,5,6},{6,9,8}};
        int[] arr1 = new int[9];
        int p =0;
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                arr1[p++] = arr[i][j];
            }
        }
        Arrays.sort(arr1);
        if((arr[0].length*arr.length)%2!=0)
        {
            int median = (1+(arr[0].length*arr.length))/2;
            System.out.print("The Median is = "+arr1[median-1]);
        }


        
    }
        
}