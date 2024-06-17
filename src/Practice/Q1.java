package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;

        while (true) {
            if (sum < input) {
            cnt += 1;
            sum += cnt;
            } else {
                break;
            }
        }

        System.out.println(cnt + " " + sum);
    }
}
