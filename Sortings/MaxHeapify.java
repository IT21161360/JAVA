package Sortings;

public class MaxHeapify {
    public void maxHeapify(int[] heap, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < n && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            maxHeapify(heap, n, largest);
        }
    }

    public void buildMaxHeap(int[] heap) {
        int n = heap.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(heap, n, i);
        }
    }

    public void heapSort(int[] heap) {
        int n = heap.length;

        buildMaxHeap(heap);

        for (int i = n - 1; i > 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;

            maxHeapify(heap, i, 0);
        }
    }

    public int heapExtractMax(int[] heap) {
        if (heap.length <= 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[heap.length - 1];
        maxHeapify(heap, heap.length - 1, 0);
        return max;
    }

    public static void main(String[] args) {
        int[] heap = { 12, 11, 13, 5, 6, 7 };

        System.out.print("Original array: ");
        for (int num : heap) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform heap sort
        MaxHeapify heapify = new MaxHeapify();
        heapify.heapSort(heap);

        System.out.print("Array after heap sort: ");
        for (int num : heap) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Extract maximum element from the heap
        int max = heapify.heapExtractMax(heap);
        System.out.println("Extracted max element: " + max);
    }
}
