import java.util.*;
public class SubArrayWithSumzero {
    public static void main (String args[])
    {
        int[] arr = {-7,5,-2,8,-8};
        //k= any number other than zero for which we have to find if sub array sum =0
        //We can simply use sum-k in the if statement
        boolean found = false;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int elements:arr)
        {
            set.add(sum);
            sum = sum+elements;
            if(set.contains(sum))
            {
                found = true;
                break;
            }
        }
        System.out.print("Found "+found);  
       

    }
    
}
