import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums){
            if(!hash.contains(num)){
                hash.add(num);
            }
        }


        int result = hash.size() > nums.length / 2 ? nums.length / 2 : hash.size();

        return result;
    }
}