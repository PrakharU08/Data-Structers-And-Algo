import java.lang.Math;
public class KaddensAlgo{
    public static void main(String args[])
    {
        int[] arr = {1,2,-5,6,-7,9};
        int max_so_far = 0;
        int maxEndinghere = 0;

        for(int i=0;i<arr.length;i++)
        {
            maxEndinghere = Math.max(arr[i]+maxEndinghere,arr[i]);
            max_so_far = Math.max(max_so_far, maxEndinghere);
        }
        System.out.println(max_so_far);
    }
}