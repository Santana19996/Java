package methodsAndChallenges;

public class NestedforLoopPrinter {

    public static void printer(int weeks,int days) {
        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
    }

    public static void main(String[] args) {
printer(3,7);
    }
}
