class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        if(arr.length == 0){
            return 0;
        }

        for (int num : arr){
            answer += num;
        }

        return answer / arr.length;
    }
}