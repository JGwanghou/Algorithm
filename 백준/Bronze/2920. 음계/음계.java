
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];

        String result = "";
        int ascendingCount = 0;
        int descendingCount = 0;
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
            
            if(inputs[i] == i + 1){ ascendingCount++; }
            else if(inputs[i] == 8 - i){ descendingCount++; }
        }
        sc.close();

        if(ascendingCount == 8){ result = "ascending"; }
        else if(descendingCount == 8){ result = "descending"; }
        else{ result = "mixed"; }

        System.out.println(result);
    }
}