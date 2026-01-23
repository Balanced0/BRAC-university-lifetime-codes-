public class MaxHeap {
    private int[] array;
    private int heapSize;

    public MaxHeap(int capacity) {
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
        if (array[parent_index] < array[i]) {
            swap(parent_index, i);
            i = parent_index;
            swim(i);
        }
    }

    public int extractMax(){
        int max = array[0];
        array[0] = array[heapSize - 1];
        heapSize--;
        sink(0);
        return max;
    }

    public void sink(int parent_index){
        if(parent_index >= heapSize){
            return;
        }
        int right_child_index = right_child(parent_index);
        int left_child_index = left_child(parent_index);
        int largest = parent_index;
        if(left_child_index < heapSize && array[left_child_index] > array[largest]){
            largest = left_child_index;
        }
        if(right_child_index < heapSize && array[right_child_index] > array[largest]){
            largest = right_child_index;
        }
        if(largest != parent_index){
            swap(parent_index, largest);
            sink(largest);
        }
    }

    public void sort(){
        if(heapSize == 0){
            return;
        }
        int originalSize = heapSize;
        for(int i = 0; i < originalSize; i++){
            int max = extractMax();
            array[originalSize - 1 - i] = max;
        }
        heapSize = originalSize;
    }

    public void swap(int parent_index, int child_index) {
        int temp = array[parent_index];
        array[parent_index] = array[child_index];
        array[child_index] = temp;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int right_child(int parent){
        return (parent * 2) + 2;
    }

    public int left_child(int parent){
        return (parent * 2) + 1;
    }
}
