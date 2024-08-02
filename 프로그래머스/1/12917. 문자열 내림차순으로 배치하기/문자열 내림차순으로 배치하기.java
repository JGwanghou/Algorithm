import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list = Arrays.asList(String.valueOf(s).split(""));
        list.sort(Collections.reverseOrder());
        
        return String.join("", list);
    }
}