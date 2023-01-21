public class Heapsort {

    public static void sort(int [] numbers) {
        for(int index = numbers.length/2 - 1; index >= 0; index--) {
            Heapify(numbers, index, numbers.length);
        }
        for(int index = numbers.length - 1; index > 0; index--) {
            int temp = numbers[0];
            numbers[0] = numbers[index];
            numbers[index] = temp;
            Heapify(numbers, 0, index);
        }
    }

    // Heapify makes
    public static void Heapify(int [] numbers, int parentIndex, int sizeHeap) {
        int leftChild = 2*parentIndex + 1;
        int rightChild = 2*parentIndex + 2;
        int index = parentIndex;
        if(leftChild < sizeHeap && numbers[leftChild] > numbers[parentIndex]) {
            parentIndex = leftChild;
        }
        if(rightChild < sizeHeap && numbers[rightChild] > numbers[parentIndex]) {
            parentIndex = rightChild;
        }
        if(index != parentIndex) {
            int temp = numbers[parentIndex];
            numbers[parentIndex] = numbers[index];
            numbers[index] = temp;
            Heapify(numbers, parentIndex, sizeHeap);
        }
    }
}