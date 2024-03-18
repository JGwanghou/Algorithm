
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        int ascCount = 0;
        int descCount = 0;
        String result = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());

            if(inputs[i] == i + 1) ascCount++;
            if(inputs[i] == 8 - i) descCount++;
        }

        if(ascCount == 8) result = "ascending";
        else if(descCount == 8) result = "descending";
        else result = "mixed";

        System.out.println(result);
    }
}