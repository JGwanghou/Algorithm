import java.util.*;

// 일차선 다리에 트럭이 지나간다. 모든 트럭이 지나갈 때 총 몇초 걸리는지?
// bridge_length: 다리에 올라갈수 있는 최대 트럭
// weight 이하까지만
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> waiting = new LinkedList<>();  // 대기 트럭
        Queue<Integer> bridge = new LinkedList<>();   // 다리 위 트럭
        int currentWeight = 0;  
        int time = 0;          
        
        // 대기 트럭 큐 초기화
        for (int truck : truck_weights) {
            waiting.offer(truck);
        }
        
        // 다리 큐 0으로 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        // 모든 트럭이 지나갈 때까지
        while (!bridge.isEmpty()) {
            // 시간 증가
            time++;
            
            // 다리에서 트럭 빼기
            currentWeight -= bridge.poll();
            
            // 대기 트럭이 있다면
            if (!waiting.isEmpty()) {
                // 다리에 새 트럭이 올라갈 수 있는지 확인
                if (currentWeight + waiting.peek() <= weight) {
                    int truck = waiting.poll();
                    bridge.offer(truck);
                    currentWeight += truck;
                } else {
                    bridge.offer(0);
                }
            }
        }
        
        return time;
    }
}