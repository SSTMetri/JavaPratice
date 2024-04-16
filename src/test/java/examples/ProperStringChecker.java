package examples;

import java.util.Stack;

public class ProperStringChecker {

    public static boolean isProperString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) 
        {
            if (c == '(' || c == '[' || c == '{') 
            {
                stack.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') 
            {
                if (stack.isEmpty()) 
                {
                    return false;
                }
                
                char opening = stack.pop();
                if ((c == ')' && opening != '(') || (c == ']' && opening != '[') || (c == '}' && opening != '{')) 
                {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String s1 = "([{}])";
        String s2 = "{{))";
        
        System.out.println("Is s1 a proper string? " + isProperString(s1));
        System.out.println("Is s2 a proper string? " + isProperString(s2));
    }
}

