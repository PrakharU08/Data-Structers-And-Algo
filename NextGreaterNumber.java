import java.util.Arrays;

public class NextGreaterNumber {

    static void swap(int ar[], int i, int j)  
    { 
        int temp = ar[i]; 
        ar[i] = ar[j]; 
        ar[j] = temp; 
    }
    public static void main(String args[])
    {
        int n = 218765;
        int c = 0;
        for(int p=n;p>0;)
        {
            p = p/10;
            c++;
        }
        //c = number of digits
        int arr[] = new int[c];
        for(int j = arr.length-1; j>=0;j--)
        {
            int rem = n%10;
            n = n/10;
            arr[j] = rem;
        }
        



        int j = arr.length-1;
        while(j>=0)
        {
            if(arr[j-1]>arr[j])
            {
                j--;
            }
            else break;
        }
        if(j==0)
        {
            System.out.print("Not Possible");
        }
        else
        {
            int x = arr[j-1]; 
            int min = j;
            
            
            for(int d = arr.length-1; d>=j-1 ;d--)
            {
                if(arr[d]>x && arr[d] < arr[min])
                {
                     min = d;
                }
            }
            swap(arr,j-1,arr.length-1);
            Arrays.sort(arr, j , arr.length);
            System.out.print("Next number with same" + 
                                    " set of digits is "); 
            for (int h = 0; h < arr.length; h++) 
                System.out.print(arr[h]); 
        } 
    }
 }
    

