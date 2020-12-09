public class RomantoInteger {
    static int values(char a) {
        if (a == 'I')
            return 1;
        if (a == 'V')
            return 5;
        if (a == 'X')
            return 10;
        if (a == 'L')
            return 50;
        if (a == 'C')
            return 100;
        if (a == 'D')
            return 500;
        if (a == 'M')
            return 1000;
        return -1;
    }

    public static void main(String args[]) {
        String roman = "MCMIV";
        int res = 0;
        for (int i = 0; i < roman.length(); i++) {
            int s = values(roman.charAt(i));
            if(i+1<roman.length())
            {
                int s1 = values(roman.charAt(i+1));
                if(s>=s1)
                {
                    res = res+s;
                }
                else
                {
                    res = res+s1-s;
                    i++;
                }

            }
            else
            {
                res = res+s;
            }
        }
        System.out.print("The integer is = " +res);
    }
}
