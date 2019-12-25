public class Swap2Vars {
    static void swapXOR(int a, int b) {
        System.out.println("Was: " + a + " " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Now: " + a + " " + b);
    }

    static void swapArithmetic(int a, int b) {
        System.out.println("Was: " + a + " " + b);
        a = a + b;
        b = - b + a;
        a = a - b;
        System.out.println("Now: " + a + " " + b);
    }
    public static void main(String[] args) {
        int a = 45;
        int b = 100;
        Swap2Vars.swapXOR(a, b);
        Swap2Vars.swapArithmetic(a, b);
    }
}
