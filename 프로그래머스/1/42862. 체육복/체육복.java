class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        for(int i = 0; i < reserve.length; i++){
            if(i >= lost.length || answer == n){
                break;
            }
            
            for(int j = 0; j < lost.length; j++){
                if(reserve[i] == lost[i] - 1 || reserve[i] == lost[i] + 1){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}