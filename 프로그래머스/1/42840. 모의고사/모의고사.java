import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == num1[i % num1.length]){
                cnt[0]++;
            }
            
            if(answers[i] == num2[i % num2.length]){
                cnt[1]++;
            }
            
            if(answers[i] == num3[i % num3.length]){
                cnt[2]++;
            }
        }
        
        int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        List<Integer> results = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(maxScore == cnt[i]){
                results.add(i + 1);
            }
        }
            
            
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}