public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = new int[]{1,5,7,4,3,8,0,6,2,9};
        //sort.bubbleSort(array);
        //sort.selectionSort(array);
        //sort.insertionSort(array);
        int[] smth = sort.mergeSort(array);
        for (int x : smth) {
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

    /**
     *
     * Merge sort realization
     */
    private int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int indexResult = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                result[indexResult] = arr1[index1];
                ++index1;
            } else {
                result[indexResult] = arr2[index2];
                ++index2;
            }
            ++indexResult;
        }
        while (index1 < arr1.length) {
            result[indexResult] = arr1[index1];
            ++index1;
            ++indexResult;
        }
        while (index2 < arr2.length) {
            result[indexResult] = arr2[index2];
            ++index2;
            ++indexResult;
        }
        return result;
    }

    public int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int[] firstHalf = new int[array.length / 2];
        int[] secondHalf = new int[array.length - array.length / 2];
        System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, secondHalf, 0, array.length - array.length / 2);
        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);
        return merge(firstHalf, secondHalf);
    }
}
