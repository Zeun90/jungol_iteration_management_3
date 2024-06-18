package Practice;

public class Q7 {
    public static void main(String[] args) {
        char alphabet = 'a';
        int num = 1;
        int height = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%c ", alphabet);
                alphabet++;
            }
            for (int k = height; k > i; k--) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }
    }
}
