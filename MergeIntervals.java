import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval
{
    int start;
    int end;

    public Interval(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals
{
    public static List<Interval> merge(List<Interval> interval)
    {
        //if the list has less than 1 interval
        if(interval.size()<2)
        {
            return interval;
        }
        
        List<Interval> output = new ArrayList<>();
        Collections.sort(interval,(a,b)->Integer.compare(a.start,b.start));

        //Take interval present at 0
        Interval temp = interval.get(0);
        int start = temp.start;
        int end= temp.end;

        //Starting from first interval
        for(int i = 1;i<interval.size();i++)
        {
            temp = interval.get(i);

            if(temp.start<=end)
            {
                end = Math.max(end,temp.end);
            }
            else
            {
                output.add(new Interval(start, end));
                start = temp.start;
                end = temp.end;
            }
        }
        output.add(new Interval(start,end));
        return output;
    }
    
    
    public static void main(String args[])
    {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1,4));
        input.add(new Interval(2,6));
        input.add(new Interval(8,10));
        input.add(new Interval(8,9));
        //input.add(new Interval(9,11));
        //input.add(new Interval(15,18));
        //input.add(new Interval(2,4));
        //input.add(new Interval(16,17));

        List<Interval> output = merge(input);

        for(Interval result : output) {
            System.out.println(result.start + " " + result.end);
        }
    }
}