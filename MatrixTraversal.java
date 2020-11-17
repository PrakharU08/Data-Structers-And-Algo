public class MatrixTraversal {
    
    static void SpiralMatrix(int[][]arr)
    {
       int top = 0;
       int down = arr.length-1;
       int left = 0;
       int right = arr[0].length-1;
       int dir = 0;
       while(top<=down && left<=right)
       {
           if (dir==0)
           {
               for(int i=top;i<=right;i++)
               {
                   System.out.print(arr[top][i]+" ");
               }
               top++;
           }
           if(dir==1)
           {
               for (int i = top;i<=down;i++)
               {
                    System.out.print(arr[i][right]+" ");
               }
               right--;
           }
           if(dir==2)
           {
               for(int i=right;i>=left;i--)
               {
                   System.out.print(arr[down][i]+" ");
               }
               down--;
           }
           if(dir==3)
           {
               for (int i = down;i>=top;i--)
               {
                   System.out.print(arr[i][left]+" ");
               }
               left++;
           }
           dir = (dir+1)%4;

       }
    }
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3,4},
                       {4,5,6,7},
                       {7,8,9,1},
                       {4,5,6,7},
                        };
    SpiralMatrix(arr);
        
    }
    
}
