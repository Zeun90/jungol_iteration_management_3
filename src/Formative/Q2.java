package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = 0;

        if (1 <= input && input <= 100) {
            for (int i = 1; result <= 100; i++) {
                result = input * i;
                System.out.printf("%d ", result);
                if (result % 10 == 0)
                    break;
            }
        }
    }
}
