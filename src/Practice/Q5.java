package Practice;

public class Q5 {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
