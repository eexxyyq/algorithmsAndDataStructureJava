public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        for (int i = 0; i < 8; i++) {
            System.out.println(factorial.factorial(i));
        }

    }
    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
