
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*


    input.charAt(j) == '(' 이렇게 하지말 것, 헷갈림


 */




public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // 로직
        for (int i = 0; i < N; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        
        // 출력
        System.out.println(sb.toString());
    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }

            else if (stack.isEmpty()) {
                return "NO";
            }

            else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }else{
            return "NO";
        }
    }
}



