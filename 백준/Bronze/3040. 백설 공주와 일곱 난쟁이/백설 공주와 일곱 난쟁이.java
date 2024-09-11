
import java.util.Scanner;

// 09:14 start
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();

            sum += num;
            arr[i] = num;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum - 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    for (int k = 0; k < 9; k++) {
                        if(k != i && k != j) {
                            System.out.println(arr[k]);
                        }
                    }
                }
            }
        }

    }
}
