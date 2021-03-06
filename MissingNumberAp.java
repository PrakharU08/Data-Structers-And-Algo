public class MissingNumberAp {
    public static void main(String args[])
    {
        int a = 1;
        int d = 5;
        int ele = 10;

        if(d==0)
        {
            if(a==ele)
            {
                System.out.print(1);
            }
            else
            {
                System.out.print(0);
            }
        }
        else
        {
            if(((ele-a)/d)<0)
                System.out.print(0);
            else
            {
                if((ele-a)%d==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
        }
    }
    
}
