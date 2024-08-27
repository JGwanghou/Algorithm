import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 0 < a < b < n
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력
        //1.테스트 케이스(숫자)가 입력된다
        int T = Integer.parseInt(br.readLine());
        
        //로직
        //2. 1의 숫자만큼 반복문 생성.
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 0;
            
            for(int a = 1; a < n; a++){
                for(int b = a + 1; b < n; b++){
                    if(((a * a) + (b * b) + m) % ( a * b ) == 0){
                        result++;
                    }
                }
            }
            
            System.out.println(result);
        }

    }
}