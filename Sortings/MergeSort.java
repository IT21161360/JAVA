package Sortings;

public class MergeSort {

    public static void mergeSort(int[] array, int low, int high) {
        
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);

        }
    }

    private static void merge(int[] array, int low, int mid, int high) {

        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        int[] left = new int[leftSize];  //left.length
        int[] right = new int[rightSize]; //right.length

                            //left.length
        for (int i = 0; i < leftSize; i++) {
            left[i] = array[low + i];
        }
                            //right.length
        for (int j = 0; j < rightSize; j++) {
            right[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < leftSize) {
            array[k++] = left[i++];
        }

        while (j < rightSize) {
            array[k++] = right[j++];
        }
    }

}
