package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String st = "*";
        String space = " ";

        for (int i = 1; i < input + 1; i++) {
            System.out.println(space.repeat(input-i)+st.repeat(i));
        }
    }
}
