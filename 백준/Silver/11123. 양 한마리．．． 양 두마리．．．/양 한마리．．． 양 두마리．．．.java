
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int H,M;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            map = new int[H+1][M+1];
            visited = new boolean[H+1][M+1];

            for (int i = 0; i < H; ++i) {
                String str = br.readLine();
                for (int j = 0; j < M; ++j) {
                    if(str.charAt(j) == '#'){
                        map[i][j] = 1;
                    }else{
                        map[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < M; ++j) {
                    if(map[i][j] == 1 && !visited[i][j]){
                        BFS(i, j);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }

    }

    static void BFS(int x, int y) throws IOException {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;

        while (!q.isEmpty()){
            int[] arr = q.poll();
            int al = arr[0] , ar = arr[1];

            for (int i = 0; i < 4; ++i) {
                int nx = al + dx[i];
                int ny = ar + dy[i];

                if (nx < 0 || ny < 0 || nx >= H || ny >= M) continue;

                if(!visited[nx][ny] && map[nx][ny] == 1){
                    q.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
