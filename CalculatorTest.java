public class CalculatorTest {
    public static void main(String[] args) {
        int failed = 0;

        if (Calculator.add(2, 3) == 5) {
            System.out.println("PASS: add(2, 3) == 5");
        } else {
            System.out.println("FAIL: add(2, 3) expected 5, got " + Calculator.add(2, 3));
            failed++;
        }

        if (Calculator.multiply(4, 5) == 20) {
            System.out.println("PASS: multiply(4, 5) == 20");
        } else {
            System.out.println("FAIL: multiply(4, 5) expected 20, got " + Calculator.multiply(4, 5));
            failed++;
        }

        if (failed > 0) {
            System.out.println("TESTS FAILED: " + failed);
            System.exit(1); // Non-zero exit code stops the Jenkins pipeline!
        }

        System.out.println("ALL TESTS PASSED!");
    }
}
