class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 배열 초기화
        int[] student = new int[n+2];
        
        // 도난 당한 학생의 경우 -1로 저장
        for(int i = 0; i < lost.length; i++){
            student[lost[i]]--;
        }
        
        // 여분 체육복 있는 학생의 경우 1로 저장
        for(int i = 0; i < reserve.length; i++){
            student[reserve[i]]++;
        }
        
        // ex) [1, -1, 1, -1, 1] 
        for(int i = 0; i < student.length; i++){
            // 내가 현재 도난 당했다면
            if(student[i] == -1){
                // 내 앞의 사람이 여분이 있나 확인
                if(student[i - 1] == 1){
                    // 있다면 빌려주고 둘다 0으로 만들기
                    student[i]++;
                    student[i - 1]--;
                }
                // 앞 사람이 없다면 뒷 사람이 여분이 있나 확인
                else if(student[i + 1] == 1){
                    // 있다면 빌려주고 둘다 0으로 만들기
                    student[i]++;
                    student[i + 1]--;
                }
                // 앞 뒤 둘다 여분이 없다면
                else{
                    n--;
                } 
            }
        }
        
        return n;
    }
}