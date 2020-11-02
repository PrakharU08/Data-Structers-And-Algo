public class CountInversion{
    public static void main(String[] args) {
        int[] arr = {9,6,8,4};
        int inversion =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(i<j && arr[i]>arr[j])
                {
                    inversion++;
                }
            }
        }
        System.out.print(inversion);
    }
}