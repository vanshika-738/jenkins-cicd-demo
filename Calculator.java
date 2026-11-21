public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Calculator App v1.0 Running!");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("4 * 5 = " + multiply(4, 5));
    }
}
