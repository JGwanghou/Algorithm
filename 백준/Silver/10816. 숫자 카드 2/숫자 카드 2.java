import java.io.*;
import java.util.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static int N,M, num;
    public static Integer[] arr1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr1 = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        } // arr1 완성
        Arrays.sort(arr1);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(num) - lowerBound(num)).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    public static int lowerBound(int key){
        int left = 0;
        int right = arr1.length;

        while(left < right){
            int mid = (left + right) / 2;

            if(key <= arr1[mid]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    public static int upperBound(int key){
        int left = 0;
        int right = arr1.length;

        while(left < right){
            int mid = (left + right) / 2;

            if(key < arr1[mid]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
}