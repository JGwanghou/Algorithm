import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().replaceAll(" ", "");
        String str2 = br.readLine().replaceAll(" ", "");
        String value = str1.replaceAll(str2, "");
        
        System.out.println((str1.length() - value.length()) / str2.length());
	}

}