import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Intervals
{
    int start;
    int end;

    public Intervals(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
}



public class KSmallestNumberAgain {
    public static void main(String args[])
    {
        ArrayList<Intervals> input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            while(n-->0)
            {
                System.out.println();
                input.add(new Intervals(sc.nextInt(),sc.nextInt()));
            }

            //Sorting the list
            Collections.sort(input,(a,b)->Integer.compare(a.start,b.start));

            ArrayList<Intervals> output = new ArrayList<>();
            Intervals temp = input.get(0);
            int start = temp.start;
            int end = temp.end;

            //Merging the intervals
            for(int i =1;i<input.size();i++)
            {
                temp = input.get(i);
                if(temp.start<=end)
                    end = Math.max(temp.end,end);
                else
                {
                    output.add(new Intervals(start, end));
                    start = temp.start;
                    end = temp.end;
                }
            }
            output.add(new Intervals(start,end));
            while(q-->0)
            {
                int k = sc.nextInt();

                int ans = -1;
                
                for(int i =0;i<output.size();i++)
                {
                    temp = output.get(i);
                    start = temp.start;
                    end = temp.end;
                    
                    if(end-start+1 >= k)
                    {
                        ans = start + k -1;
                        break;
                    }
                    else
                    {
                        k = k - (end-start+1);
                    }

                }
                System.out.println("Ans = " +ans);
            }

        }
        /*
        for(Intervals result : input) {
            System.out.println(result.start + " " + result.end);
        }
        */
    }
    
}
