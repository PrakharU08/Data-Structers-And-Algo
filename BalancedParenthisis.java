import java.util.Stack;

public class BalancedParenthisis {
    public static boolean check(String s)
    {
        Stack<Character> leftchar = new Stack<>();
        for(int i=0; i < s.length() ; i++)
        {   
            char x =s.charAt(i); 
            if(x == '{'||x== '(' || x == '[')
            {
                leftchar.push(x);    
            }
            else
            { 
            if(leftchar.isEmpty())
            {
                return false;
            }
            if(x == ')' && leftchar.peek()!='(' || x == '}'&& leftchar.peek()!='{' ||x == ']'&& leftchar.peek()!='[')
            {
                return false;
            }
            leftchar.pop();
            }
        }  
        return leftchar.isEmpty();
    }
    
    
    public static void main(String args[])
    {
        String s = "([{}])";
        boolean a = check(s);
        if(a==true)
        {
            System.out.print("Balanced");
        }
        else
        {
            System.out.print("Unbalanced");
        }
    }
    
}
