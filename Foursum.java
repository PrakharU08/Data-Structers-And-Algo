import java.util.*;
public class Foursum {
    private static int k;

	public static void main(String args[])
    {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int target = 0;
        int[] num = {1,0,-1,0,-2,2};
        Arrays.sort(num);
        
        for(int i =0;i<num.length;i++)
        {
            for(int j =i+1;j<num.length;j++)
            {
                int net = target-num[i]-num[j];
                int front = j+1;
                int back = num.length-1;
                while(front < back)
                {
                    ArrayList<Integer> quad = new ArrayList<>();
                    int twosum = num[front] + num[back];
                    if(twosum<net)
                        front++;
                    else if(twosum>net)
                        back--;
                    else
                    {
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    while(front<back && num[front] == quad.get(2))  ++front;
                    
                    while(front<back && num[back] == quad.get(3))  --back;
                    }
                }
                while(j+1<num.length && num[j+1] == num[j]) ++j;
            }
            while(i+1<num.length && num[i+1] == num[i]) ++i;
        }
        System.out.print(res.toString());
    }
    
}
