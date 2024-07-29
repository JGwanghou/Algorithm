
import java.util.*;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')'){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if(stack.peek() == '(' && c == ')'){
                stack.pop();
            }else{
                stack.push(c);
            }

        }

        return stack.isEmpty();
    }
}