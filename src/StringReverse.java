public class StringReverse {
    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        String abc = "java";
        System.out.println(stringReverse.stringBuilderMethod(abc));
    }
    public String recursiveMethod(String inputString) {
        if (inputString.length() <= 1) {
            return inputString;
        }
        String first = inputString.substring(0, inputString.length() / 2);
        String second = inputString.substring(inputString.length() / 2);
        return recursiveMethod(second) + recursiveMethod(first);
    }
    public String atCharArrayMethod(String inputString) {
        StringBuilder res = new StringBuilder();
        char[] array = inputString.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            res.append(array[i]);
        }
        return res.toString();
    }
    public String stringBuilderMethod(String inputString) {
        StringBuilder res = new StringBuilder(inputString);
        return res.reverse().toString();
    }
}
