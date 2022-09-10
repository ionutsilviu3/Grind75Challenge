package boancionut.validparentheses;

import java.util.Stack;

public class ValidParentheses {
    private static boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;
        if(s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (char character: s.toCharArray()) {
            if(character == '(')
                stack.push(')');
            else if(character == '[')
                stack.push(']');
            else if(character == '{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != character)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";

        System.out.println(isValid(s));
    }


}
