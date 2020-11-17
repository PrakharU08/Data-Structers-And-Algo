import java.util.HashSet;
import java.util.Set;

public class ArrayisAsubsetofanotherArray {
    public static void main(String args[])
    {
        int[] arr1 = {11,4,5,7,8,9,8};
        int[] arr2 = {4,7,8};
        Set<Integer> hashset = new HashSet<Integer>();

        for (int num: arr1)
        {
            hashset.add(num);
        }
        int count =0;
        for (int num : arr2)
        {
            if(!hashset.contains(num))
            {
                System.out.print("The second array is not the subset");
                break;
            }
            else
            {
                count++;
            }
        }
        if(count == arr2.length)
        {
            System.out.println("The second array is the subset of the first array");
        }
    }    
}
