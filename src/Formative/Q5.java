package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String star = "*";
        String space = " ";

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.print(space);
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
