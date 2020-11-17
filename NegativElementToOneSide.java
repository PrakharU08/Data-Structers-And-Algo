import java.util.*;
public class NegativElementToOneSide{

    public static void main(String args[]){
        /*
        Scanner in = new Scanner(System.in);
        int[] a = {1,-2,1,0,5};
        int low = 0 ;
        int end  = a.length-1;
        int temp;
        while(low<=end)
        {
            //COndition to check if both low and end are negative
            if(a[low]<0 && a[end]<0)
            {
                low++;
            }
            // condition to check if left pointer element is positive and 
            // the right pointer element is negative
            if(a[low]>0 && a[end]<0)
            {
                temp = a[low];
                a[low] = a[end];
                a[end] = temp;
                low++;
                end--;

            }
            else if (a[low]>0 && a[end] >0)
                end-=1;
            else{
            low += 1;
            end -= 1;
          }           
        }
        for(int i = 0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }*/
        

        //Quick Sort Approach
        int[] a = {1,-2,1,0,5};
        int i =-1;
        for(int j=0;j<a.length;j++)
        {
            if(a[j]<0)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        for(int m = 0;m<a.length;m++)
            {
                System.out.print(a[m]+" ");
            }


        }
    }


