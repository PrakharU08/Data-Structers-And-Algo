public class DoubleHelix {
    public static void main(String args[])
    {
        int a[] = {13, 3, 5, 7};
        int b[] = {11, 1, 4, 7};
        int n = a.length;
        int m = b.length;
        int i=0;
        int j=0;
        int s1=0;int s2=0;
        int max=0;
        while(i<n && j<m)
        {
            if(a[i]>b[j])
            {
                s2=s2+b[j];
                j++;
            }
            else if(a[i]<b[j])
            {
                s1=s1+a[i];
                i++;
            }
            else
            {
                max = max + Integer.max(s1, s2)+a[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while(i<n)
        {
            s1 = s1+a[i];
            i++;
        }
        while(j<m)
        {
            s2=s2+b[j];
            j++;
        }
        max = max+Integer.max(s1, s2);
        System.out.println(max);        
    }    
}
