public class FibonacciNums {
    public static void main(String[] args) {
        FibonacciNums f = new FibonacciNums();
        for (int i = 1; i <= 10; i++) {
            System.out.print(f.fibRecursive(i) + " ");
        }
    }

    public int fibRecursive(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        } else {
            return fibRecursive(num - 1) + fibRecursive(num - 2);
        }
    }

}
