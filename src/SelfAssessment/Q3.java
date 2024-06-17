package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String st = "*";

        for (int i = input; i > 0; i--) {
            System.out.println(st.repeat(i));
        }

        for (int i = 1; i < input + 1; i++) {
            System.out.println(st.repeat(i));
        }
    }
}
