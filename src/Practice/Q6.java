package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int num = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }
    }
}
