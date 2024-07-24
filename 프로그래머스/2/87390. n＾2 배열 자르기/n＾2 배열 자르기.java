import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right+1 - left)];

        int idx = 0;
        for (Long i = left; i <= right; i++) {
            int y = (int)(i/n);
            int x = (int)(i%n);

            result[idx++] = Math.max(y, x) + 1;
        }

        return result;
    }
}