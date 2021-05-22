public class SumOFTwoLargeNumber {
    
    static String fillzero(String str,int c)
    {
        int len = str.length();
        while(len<c)
        {
            str = "0"+str ;
            len++;
        }

        return str;
    }
    
    static String sumString(String a,String b)
    {
        if(a.length()>b.length())
        {
            b = fillzero(b,a.length());
        }
        else
        {
            a = fillzero(a,b.length());
        }
        
        String str = "";
        int n = a.length();
        int carry =0;
        int s = 0;
        for(int i = n-1;i>=0;i--)
        {
            int sum = ((int)(a.charAt(i) - '0') +
                    (int)(b.charAt(i) - '0') + carry);
            str = (char) (sum % 10 + '0') + str;
            carry = sum/10;
        }
        System.out.println(str);

        
        return "0";
    }
    
    
    public static void main(String[] args) {
        String str1 = "12121212121212121111111111111121221212121212122121212222222222";
        String str2 = "679";
        String res = sumString(str1,str2);
    }
}
