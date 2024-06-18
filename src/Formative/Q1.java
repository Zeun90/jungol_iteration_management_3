package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input;
        int cnt = 0;
        int sum = 0;
        int avg;

        while (true) {
            input = Integer.parseInt(st.nextToken());

            if (input == 0)
                break;

            cnt++;
            sum += input;
        }

        avg = sum / cnt;

        System.out.println(sum + " " + avg);
    }
}
