public class CountStringIn2dArray {
    
    
    static int search(char[][] a,int i,int j,String str,int size,int idx)
    {
        int found =0;
        if(i>=0 && j>=0 && i<6 && j<6 && a[i][j] == str.charAt(idx))
        {
            char temp = str.charAt(idx);
            a[i][j] = 0;
            idx = idx+1;
            if(size==idx)
            {
                found = 1;
            }
            else
            {
                found += search(a,i,j+1,str,size,idx);
                found += search(a,i,j-1,str,size,idx);
                found += search(a,i+1,j,str,size,idx);
                found += search(a,i-1,j,str,size,idx);
            }
            a[i][j] = temp;
        }
        return found;
    }
    
    
    public static void main(String args[])
    {
        char[][]  a= {
            {'D','D','D','G','D','D'},
            {'B','B','D','E','B','S'},
            {'B','S','K','E','B','K'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','G'}
           };
        String str = "GEEKS";
        int ans = 0;
        {
        int size = str.length()-1;
        for(int i =0;i<6;i++)
            for(int j=0;j<6;j++)
            {
                ans += search(a,i,j,str,size,0);
            }
        }
        System.out.print(ans);
        
    }
    
}
