import java.io.*;
import java.util.*;

/*
백준 2583
 */
public class Main {
    static int[][] map;
    static int M,N,K;
    static ArrayList<Integer> answer;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 예제입력 5(M) 7(N) 3(K)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        answer = new ArrayList<>();

        // K개 한 줄의 영역을 입력받는다
        for (int i = 0; i < K; i++) {
            String[] str = br.readLine().split(" ");

            int startX = Integer.parseInt(str[0]); // 0
            int startY = Integer.parseInt(str[1]); // 2
            int endX = Integer.parseInt(str[2]); // 4
            int endY = Integer.parseInt(str[3]); // 4

            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    map[j][k] = 1; // 주의: 가로, 세로 순서
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0 && !visited[i][j]){
                    BFS(i, j);
                }
            }
        }

        Collections.sort(answer);
        
        sb.append(answer.size()+"\n");
        for (int num : answer){
            sb.append(num+" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void BFS(int x, int y){
        int area = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()){
            int[] arr = q.poll();
            int al = arr[0], ar = arr[1];

            for (int i = 0; i < 4; i++) {
                int nx = al + dx[i];
                int ny = ar + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if(!visited[nx][ny] && map[nx][ny] == 0){
                    area++;
                    q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }

        answer.add(area);
    }
}
