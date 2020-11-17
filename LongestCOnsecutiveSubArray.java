import java.util.*;
public class LongestCOnsecutiveSubArray {
    public static void main(String args[])
    {
        int[] arr = {2,3,4,19,20,21,22};
        Set<Integer> hashset = new HashSet<Integer>();
        for(int num : arr)
        {
            hashset.add(num);
        }

        int longeststreak = 1;
        for(int num : arr)
        {
           if(!hashset.contains(num-1))
           {
               int startstreak = num;
               int currentstreak = 1;
               while(hashset.contains(startstreak+1))
               {    
                   startstreak++;
                   currentstreak++;
                   
               }
               longeststreak = Math.max(currentstreak, longeststreak);
               

           }
        }
        System.out.println(longeststreak);
        

        
    }
    
}
