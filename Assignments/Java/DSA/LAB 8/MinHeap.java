public class MinHeap {
    private int[] array;
    private int heapSize;

    public MinHeap(int capacity) {
        array = new int[capacity];
        heapSize = 0;
    }

    public void insert(int n) {
        if (heapSize == array.length) {
            return;
        }
        array[heapSize] = n;
        swim(heapSize);
        heapSize++;
    }

    public void swim(int i) {
        if (i == 0) {
            return;
        }
        int parent_index = parent(i);
        if (array[parent_index] > array[i]) {
            swap(parent_index, i);
            i = parent_index;
            swim(i);
        }
    }

    public int extractMin() {
        int min = array[0];
        array[0] = array[heapSize - 1];
        heapSize--;
        sink(0);
        return min;
    }

    public void sink(int parent_index) {
        if (parent_index >= heapSize) {
            return;
        }
        int right_child_index = right_child(parent_index);
        int left_child_index = left_child(parent_index);
        int smallest = parent_index;
        if (left_child_index < heapSize && array[left_child_index] < array[smallest]) {
            smallest = left_child_index;
        }
        if (right_child_index < heapSize && array[right_child_index] < array[smallest]) {
            smallest = right_child_index;
        }
        if (smallest != parent_index) {
            swap(parent_index, smallest);
            sink(smallest);
        }
    }

    public void sort() {
        if (heapSize == 0) {
            return;
        }
        int originalSize = heapSize;
        for (int i = 0; i < originalSize; i++) {
            int min = extractMin();
            array[originalSize - 1 - i] = min;
        }
        heapSize = originalSize;
    }

    public void printHeap() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void swap(int parent_index, int child_index) {
        int temp = array[parent_index];
        array[parent_index] = array[child_index];
        array[child_index] = temp;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int right_child(int parent) {
        return (parent * 2) + 2;
    }

    public int left_child(int parent) {
        return (parent * 2) + 1;
    }
}
