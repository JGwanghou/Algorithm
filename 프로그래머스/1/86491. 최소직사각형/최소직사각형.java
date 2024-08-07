class Solution {
    public int solution(int[][] sizes) {
        // 최대값 최소값
        int[] result = new int[2];

        for(int i = 0; i < sizes.length; i++){
            int maxNum = Math.max(sizes[i][0], sizes[i][1]);
            int minNum = Math.min(sizes[i][0], sizes[i][1]);

            result[0] = Math.max(result[0], maxNum);
            result[1] = Math.max(result[1], minNum);
        }
        
        return result[0] * result[1];
    }
}