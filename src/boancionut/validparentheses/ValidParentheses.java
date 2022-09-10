package boancionut.validparentheses;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example:
() is valid.
[() is invalid, because '[' doesn't have a pair
* */

public class ValidParentheses {
    private static boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')      // if the string starts with the right part, it's automatically an invalid string
            return false;
        if(s.length() % 2 == 1)         // same thing if it's an uneven number of parenthesis, because one doesn't have a pair
            return false;
        Stack<Character> stack = new Stack<>();
        for (char character: s.toCharArray()) {     // we iterate through the string char by char
            if(character == '(')                    // if the char is a left parenthesis, we will push the right pair
                stack.push(')');
            else if(character == '[')
                stack.push(']');
            else if(character == '{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != character)        // if the char is a right parenthesis, we pop the last element
                                                                        // and if they aren't the same char, then the string is invalid
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));         // the main idea of the algorithm is that for every left par. that we encounter
                                                // we will push the right par. into a stack
                                                // if we encounter the right par., we pop the last stack element and check if it is the same right par.
                                                // if not, then it means that the last par. wasn't the pair to this one
    }


}
