public class CharactertobeaddedForPallindrom {
    
    public static boolean pallindrom(String s)
    {
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        String s ="racecar";
        int count = 0;
        int flag =0;
        while(s.length()>0)
        {
            if(pallindrom(s))
            {
                flag =1;
                break;
            }
            else
            {
                count++;
                s =s.substring(0,s.length()-1);
            }
        }
        if(flag==1)
            System.out.print("The number of insertion requird is:" +count);
        
    }
    
}
