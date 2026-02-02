public class demo {
    public static void main(String[] args) {
        for (int n = 1; n <= 12; n++) {
            System.out.println("Multiplication table for " + n + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
            System.out.println();
        }
    }
}