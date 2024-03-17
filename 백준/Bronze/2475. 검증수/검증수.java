
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int index = sc.nextInt();

            sum += index * index;
        }
        
        int result = sum %10;
        System.out.println(result);
    }
}