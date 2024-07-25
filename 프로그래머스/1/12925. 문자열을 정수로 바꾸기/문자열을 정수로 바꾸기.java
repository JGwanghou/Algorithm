class Solution {
    public int solution(String s) {
        int sign = 1;   // 부호 여부
        int index = 0;
        
        if(s.charAt(0) == '-') {
            sign = -1;
            index = 1;
        }else if(s.charAt(0) == '+'){
            index = 1;
        }

        int result = 0;
        for (int i = index; i < s.length(); i++) {
            // result =   0 * 10 + 1, result에는 1
            // result =   1 * 10 + 2, result에는 12
            // result =  12 * 10 + 3, result에는 123
            // result = 123 * 10 + 4, result에는 1234
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result * sign;
    }
}