import java.util.Stack;

public class DuplicateStringremoval {
    public static void main(String args[])
    {
        String str = "azxxzy";
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            char chr = str.charAt(i);
            if(stack.isEmpty() || stack.peek() != chr)
            {
                stack.add(chr);
            }
            else if(stack.peek() == chr)
            {
                stack.pop();
            }
        }
        System.out.print(stack);
    }
    
}
