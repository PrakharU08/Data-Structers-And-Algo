import java.util.HashMap;

public class Subarraywithsymzero {
    public static void main(String args[])
    {
        int arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
        int i = -1;
        int count =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        while(i<arr.length-1)
        {
            i++;
            sum += arr[i];

            if(map.containsKey(sum))
            {
                count += map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
            else
                map.put(sum,1);
        }
        System.out.print(count);
    }
    
}
