package SelfAssessment;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        char alphabet = 'A';
        int num = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.printf("%d ", num);
                num++;
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%c ", alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
