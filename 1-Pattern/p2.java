public class p2 {
    public static void main(String[] args) {
        pattern_2(6);
    }

    static void pattern_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
