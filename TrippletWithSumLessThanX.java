import java.util.Arrays;

public class TrippletWithSumLessThanX {
    public static void main(String args[])
    {
        int[] arr = {5, 1, 3, 4, 7};
        int x = 12;
        int count =0;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-2;i++)
        {
            int j = i+1;
            int k = arr.length-1;
            while(j<k)
            {   int s =arr[i]+arr[j]+arr[k];
                if(s<x)
                    {
                        //System.out.println(arr[i]+ " " +arr[j]+" "+arr[k]);
                        count += (k-j);
                        j++;
                    }
                else
                    k--;
            }
        }
        System.out.println(count);
    }
    
}
