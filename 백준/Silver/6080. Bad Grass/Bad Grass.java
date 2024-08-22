import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    // 방향 벡터, 상하좌우 및 대각선을 고려합니다.
    private static final int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    private static final int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    private static int R, C;
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // R과 C 입력받기
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        visited = new boolean[R][C];

        // 지도 정보 입력받기
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int islandCount = 0;

        // 지도 탐색
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // 아직 방문하지 않은 나쁜 풀이 있으면 새로운 섬을 찾은 것
                if (!visited[i][j] && map[i][j] > 0) {
                    bfs(i, j);
                    islandCount++;
                }
            }
        }

        // 결과 출력
        System.out.println(islandCount);
    }

    // BFS로 연결된 나쁜 풀을 모두 방문 표시
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            // 8방향으로 이동
            for (int i = 0; i < 8; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 범위 내에 있고, 아직 방문하지 않았으며, 나쁜 풀인 경우
                if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && map[nx][ny] > 0) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
