import java.util.*;
public class PairWithGivenDiffrence {
    public static void main(String args[])
    {
        int arr[] = {44,12,3,10,20};
        int diff = 7;
        int f = -1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<arr.length;i++)
            map.put(arr[i], 1);
        for(int i =0;i<arr.length;i++)
        {
            int y = diff+arr[i];
            if(map.containsKey(y))
            {
                f =1;
                break;
            }
        }
        System.out.print(f);

    }
}
