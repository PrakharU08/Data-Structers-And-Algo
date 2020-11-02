import java.util.Arrays;
public class DupInAnArray{
    public static void main(String args[])
    {
        int[] arr = {7,8,2,3,4,1,1,2,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.print("Dup="+arr[i]);       
            }
        }


    }
}