public class Search {
    /**
     * binary search realization
     * */
    public void binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                String res = String.format("Искомое число %d находится в массиве под %d индексом", value, mid);
                System.out.println(res);
                return;
            } else if (value > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
