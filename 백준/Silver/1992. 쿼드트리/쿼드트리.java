
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
흰 점 나타내는 0
검은 점 나타내는 1
 */
public class Main {

    public static int[][] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정사각형 N 숫자입력
        int N = Integer.parseInt(br.readLine());

        // N으로 배열 초기화
        arr = new int[N][N];

        // 배열 데이터 삽입
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        // 쿼드트리 함수 호출
        QuadTree(0, 0, N);
        System.out.println(sb.toString());
    }

    public static void QuadTree(int x, int y, int size) {

        // 압축 가능할 경우 하나의 색상으로 압축해준다.
        if(isPossible(x, y, size)){
            sb.append(arr[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append("(");

        QuadTree(x, y, newSize);
        QuadTree(x, y + newSize, newSize);
        QuadTree(x + newSize, y, newSize);
        QuadTree(x + newSize, y + newSize, newSize);

        sb.append(")");
    }

    // 압축이 가능한지 해당 공간을 체크해주는 함수
    public static boolean isPossible(int x, int y, int size) {
        int value = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(value != arr[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
