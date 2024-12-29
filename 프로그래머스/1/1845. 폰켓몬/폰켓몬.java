import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 1. length 절반 저장
        int length = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        // 2. 총 개수의 절반이 중복개수보다 작다면? 개수의 절반 반환
        // 3. 총 개수의 절반이 중복개수와 같다면? 총 개수 절반 / 중복개수 둘 중 하나반환
        // 4. 총 개수의 절반이 중복개수보다 많다면? 중복 개수 반환
        
        return length <= set.size() ? length : set.size();
        
    }
}