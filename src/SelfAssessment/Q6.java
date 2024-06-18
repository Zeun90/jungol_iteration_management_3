package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        byte alphabet = 'A';

        for (int i = 0; i < input; i++) {
            for (int j = input; j > i; j--) {
                System.out.printf("%c", alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
