class Solution {
    boolean solution(String s) {
        if(s.isBlank() || s == null){
            return false;
        }

        String[] words = s.toLowerCase().split("");

        int p = 0;
        int y = 0;
        for (String word : words){
            if(word.equals("p")){
                p++;
            }

            if(word.equals("y")){
                y++;
            }
        }
        
        if(p != y){
            return false;
        }

        return true;
    }
}