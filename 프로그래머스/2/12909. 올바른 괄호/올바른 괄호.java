import java.util.*;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '('){
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '('){
                stack.push(ch);
                continue;
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
            
        }
        
        return stack.isEmpty();
    }
}