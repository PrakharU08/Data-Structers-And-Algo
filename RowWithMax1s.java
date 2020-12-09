public class RowWithMax1s {
    public static void main(String args[])
    {
        int[][] arr = {{0,0,0,0,1,1},{0,0,0,0,0,1},{0,0,0,0,1,1},{0,0,1,1,1,1}};
        int count =0;
        int max = -1;
        int row= 0;
        /*
        for(int i =0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
                if(max<=count)
                {
                    row = i;
                }
                max = Math.max(max,count);
            }
            count =0;
        }    
        System.out.println(row);
    */

    //Another Approch of traversing accros the columns AND AS soon as 1 is encountered We break the loop
    int i;
    x:
        for(int j =0;j<4;j++)
                for(i=0;i<4;i++)
                    if(arr[i][j]==1)
                    {
                        System.out.println(i);
                        break x;

                    }
    
    }
}
