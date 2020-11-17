public class AlternatePositiveNegative
{
    public static void main(String args[])
    {
        int[] arr ={-1,-9,8,7,-20,9,6,7,-30};
        int i=-1;int temp=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int pos = i+1; int neg = 0;
        //Increment the negative index by 2 and positive index by 1
        //swap alternate negative with next positive number
        while(pos<arr.length && neg<arr.length && arr[neg]<0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg+=2;
        }
        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]+" ");
        }

    }
}