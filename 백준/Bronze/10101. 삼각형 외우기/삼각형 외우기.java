
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Integer> set = new HashSet<>();
    public static int sum;

    public static String program(){
        if(sum == 180){

            if(set.size() == 2){
                return "Isosceles";
            }

            if(set.size() == 3){
                return "Scalene";
            }

        }else{
            
            return "Error";
            
        }


        return "Equilateral";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            set.add(num);
            sum += num;
        }

        System.out.println(program());
    }
}
