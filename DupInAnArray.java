import java.util.Arrays;
public class DupInAnArray{
    public static void main(String args[])
    {   
        int[] arr = {1,2,2,3,4};
        /*
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("Dup="+arr[i]);       
            }
        }
        */
        int[] ar = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            int replace = arr[i];
            ar[replace] = ar[replace]+1;
        }
        for(int i =0;i<ar.length;i++)
        {
            if(ar[i]==2)
            {
                System.out.print("Dup = "+ar[i]);
            }
        }
    }
}