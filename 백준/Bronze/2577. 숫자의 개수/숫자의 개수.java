
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int multi = A * B * C;

        int[] arr = new int[10];
        String str = String.valueOf(multi);
        for (int i = 0; i < str.length(); i++){
            arr[(str.charAt(i) - 48)]++;
        }

        for (int result : arr){
            System.out.println(result);
        }
    }
}