
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;

        for (int i = 64; i >= 1; i /= 2) {
            // X보다 작아야한다.
            if(i == X) {
                count = 1;
                break;
            }

            if(i <= X) {
                int num = sum + i;

                // 총합이 X보다 작거나 같으면
                if(num <= X){
                    sum += i;
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
