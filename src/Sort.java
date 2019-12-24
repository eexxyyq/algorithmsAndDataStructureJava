public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = new int[]{1,5,7,4,3,8,0,6,4,2,9};
        sort.bubbleSort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i ; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
