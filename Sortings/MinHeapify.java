package Sortings;

public class MinHeapify {

    public static void buildMinHeap(int[] arr) {
        int heapSize = arr.length;

        // Build Min Heap by calling minHeapify on each element starting from the last non-leaf node
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            minHeapify(arr, i, heapSize);
        }
    }

    public static void minHeapify(int[] arr, int i, int heapSize) {
        int smallest = i; // Initialize smallest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is smaller than root
        if (left < heapSize && arr[left] < arr[smallest])
            smallest = left;

        // If right child is smaller than the smallest so far
        if (right < heapSize && arr[right] < arr[smallest])
            smallest = right;

        // If the smallest element is not the root
        if (smallest != i) {
            // Swap the smallest element with the root
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively MinHeapify the affected sub-tree
            minHeapify(arr, smallest, heapSize);
        }
    }

    public static void heapSort(int[] arr) {
        int heapSize = arr.length;

        // Build Min Heap
        buildMinHeap(arr);

        // Perform Heap Sort
        for (int i = heapSize - 1; i > 0; i--) {
            // Swap the root (minimum element) with the last element of the array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reduce the heap size and maintain the min heap property
            heapSize--;
            minHeapify(arr, 0, heapSize);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 10, 3, 5, 1 };

        System.out.println("Array before Heap Sort:");
        for (int num : arr)
            System.out.print(num + " ");

        heapSort(arr);

        System.out.println("\nArray after Heap Sort (Ascending Order):");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
