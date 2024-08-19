import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int num : priorities) {
            queue.add(num);
        }
        
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                
                // [1, 1, 9, 1, 1, 1]
                // [9, 1, 1, 1, 1, 1]
                if(priorities[i] == queue.peek()){
                    answer++;
                    queue.poll();
                    
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}