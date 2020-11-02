import java.util.*;
public class MergeIntervals {  
    public static void main(String args[])
    {
        int[][] arr = {{1,2},{2,3},{8,12},{9,10},{15,19}};
        List<int[]> output_arr = new ArrayList<>();
        Arrays.sort(arr,(arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        int[] cur_interval = arr[0];
        output_arr.add(cur_interval);
        for(int[] interval : arr)
        {
            int curr_interval_end = cur_interval[1];
            int next_interval_begin = interval[0];
            int next_interval_end = interval[1];

            if(curr_interval_end>=next_interval_begin)
            {
                cur_interval[1] = Math.max(curr_interval_end,next_interval_end);

            }
            else
            {
                cur_interval = interval;
                output_arr.add(cur_interval);
            }
        }
        
	} 
        
        
    }

