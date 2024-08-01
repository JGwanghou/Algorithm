import java.util.*;
class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

//        String temp = ""; 이거보다는 String빌더 사용 권장(이유=?)
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }

        String result = String.valueOf(stringBuilder);
        
        return Long.parseLong(result);
    }
}