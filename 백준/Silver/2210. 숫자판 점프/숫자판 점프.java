// 1. 입력

// 2. 로직
// 2-1 중복이 가능한 경로 지나면서 , 숫자만들고 ㅗ최종적으로 다른 숫자
// 2-1-1 현재 위치에서 상하좌우 이동하면서 각 위치에 있는 숫자를 조합(벗어ㅏ나면안됨)

// 3. 출력

import java.util.*;

public class Main{
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] board = new int[5][5];
    static Set<String> unique = new HashSet<>();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                board[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                dfs(i, j, 0,"");
            }
        }
        
        System.out.println(unique.size());
    }
    
    public static void dfs(int x, int y, int depth, String number){
        if(depth == 6){
            unique.add(number);
            return;
        }
        
        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            
            if(nextX >= 0 && nextY >= 0 && nextX < 5 && nextY < 5){
                dfs(nextX, nextY, depth+1, number+board[x][y]);
            }
        }
    }
}