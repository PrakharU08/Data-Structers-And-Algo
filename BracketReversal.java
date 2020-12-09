import java.util.Stack;

public class BracketReversal {
    public static void main(String args[])
    {
        
        String s = "}{{}}{{{";
        if(s.length() %2 !=0)
            System.out.print("Not possible");
        else{
            Stack<Character> str = new Stack<>();
            for(int i =0; i<s.length();i++)
            {
                char g = s.charAt(i);
                if (g =='}' && !str.empty()) 
                { 
                    if (str.peek()=='{') 
                        str.pop(); 
                    else
                        str.push(g); 
                } 
                else
                    str.push(g);
            }
            int red_len = str.size(); 
        
            // count opening brackets at the end of 
            // stack 
            int n = 0; 
            while (!str.empty() && str.peek() == '{') 
            { 
                str.pop(); 
                n++; 
            } 
        
            // return ceil(m/2) + ceil(n/2) which is 
            // actually equal to (m+n)/2 + n%2 when 
            // m+n is even. 
            System.out.print("The number of reversal = " +(red_len/2 + n%2));
        }
    }
    
}
