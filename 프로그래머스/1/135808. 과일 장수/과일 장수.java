import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        
        Integer[] numbers = Arrays.stream(score).boxed().toArray(Integer[]::new);
        // 최대 판매이익이니까 내림차순 정렬
        // {4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 1, 1}
        Arrays.sort(numbers, Collections.reverseOrder());

        // 담을 수 있는 박스 수 만큼
        for(int i = 0; i < score.length / m; i++){
            // 하나의 박스에서 최소 점수
            int currentIdx = m * i + (m - 1);
            result += numbers[currentIdx] * m;
        }
        
        return result;
    }
}