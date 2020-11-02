import java.util.*;
public class NegativElementToOneSide{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] a = {0,-1,-4,0,-9,-2,1,2,-1,0};
        int low = 0 ;
        int low1 = 0;
        int temp;
        while(low<=a.length-1)
        {
            if(a[low]<0)
            {
                low++;
                low1++;
            }
            else if(a[low]>=0)
            {
                low1++;
                if(low1 ==11)
                {
                    break;
                }
                else{
                    if(a[low1]<0)
                    {
                        temp = a[low];
                        a[low] = a[low1];
                        a[low1] =temp;
                    }
                    else
                    {
                        low1++;
                    }
                }
            }
        }
        for(int i = 0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }


