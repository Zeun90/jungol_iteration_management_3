package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 1; i <= input; i++) {
            System.out.println(star.repeat(i));
        }

        for (int j = input - 1; j > 0; j--) {
            System.out.println(star.repeat(j));
        }
    }
}
