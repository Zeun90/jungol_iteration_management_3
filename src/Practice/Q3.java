package Practice;

public class Q3 {
    public static void main(String[] args) {
        String st = "*";

        for (int i = 1; i < 4; i++) {
            System.out.println(st.repeat(i));
        }

        for (int i = 3; i > 0; i--) {
            System.out.println(st.repeat(i));
        }
    }
}
