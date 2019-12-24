public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = new int[]{1,5,7,4,3,8,0,6,2,9};
        //sort.bubbleSort(array);
        //sort.selectionSort(array);
        sort.insertionSort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    /**
     * Bubble Sort realization
     */
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

    /**
     *Selection sort realization
     */
    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index= j;
                }
            }
            if (i != index) {
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
            }
        }
    }

    /**
     *Insertion Sort realization
     */
    public void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j -= 1;
                array[j + 1] = key;

            }
        }
    }
}
