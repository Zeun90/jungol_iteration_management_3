package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        String star = "*";
        String space = " ";

        for (int i = height; i > 0; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(space);
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
