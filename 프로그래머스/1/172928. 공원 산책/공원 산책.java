import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        
        // 시작 지점
        int[] start = getStartPosition(park); // [0.0]
        
        for(int i = 0; i < routes.length; i++){
            String op = routes[i].split(" ")[0];
            int mv = Integer.parseInt(routes[i].split(" ")[1]);
            
            int lx = start[0];
            int ly = start[1];
            
            for(int j = 0; j < mv; j++){
                if(op.equals("N")){
                    lx--;
                }
                if(op.equals("S")){
                    lx++;
                }
                
                
                if(op.equals("E")){
                    ly++;
                }
                if(op.equals("W")){
                    ly--;
                }
                
                if(lx >= 0 && ly >= 0 && lx < park.length && ly < park[0].length()){
                    if(park[lx].charAt(ly) == 'X'){
                        break;
                    }
                    
                    if(j == mv - 1){
                        start[0] = lx;
                        start[1] = ly;
                    }
                }
            }
        }
        
        return start;
    }
    
    
    public int[] getStartPosition(String[] park){
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    return new int[]{i, j};
                }
            }
        }
        
        return null;
    }
    
}