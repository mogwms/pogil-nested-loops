public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;  // Skip multiples of 3
            }
            if (i == 8) {
                break;     // Stop the loop completely
            }
            System.out.print(i + " ");
        }
    }
}