public class SearchElementInMatrix
{
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3,4},{5,4,6,8},{6,7,8,9}};
        int cols = arr[0].length;
        int row = arr.length;
        int ele = 4;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<cols;j++)
            {
                if(arr[i][j] == ele)
                {
                    System.out.println("Element Found");
                    break;
                }
            }

        }
    }
}