import java.util.*;
class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }

        return Long.parseLong(stringBuilder.toString());
    }
}