import java.util.*;

public class Solution {
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        int prev = arr[0];
        list.add(prev);

        for (int num : arr) {
            if(num != prev){
                list.add(num);
                prev = num;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}