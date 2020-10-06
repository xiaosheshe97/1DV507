package binheap;

import java.util.NoSuchElementException;

public class BinaryIntHeap {
    private int size;
    private int[] array;

    public BinaryIntHeap() {
        // Constructs an empty heap
        size = 0;
        array = new int[10];
    }
    public void insert(int n){
        // Add n to heap

        //add first element
        if (size == 0){
            //index 0 is empty
            array[1] = n;
            size++;
            size++;
        }
        else {
            //resize if full
            if (size >= array.length-1){
                resize();
            }

            array[size+1] = n;
            size++;

            //the first is empty, size = index
            int child = size;
            int parent = size/2;
            //if child is bigger than parent
            while (child > 1 && array[child]>array[parent]){
                swap(child,child/2);
                child = child / 2;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void resize(){
        int[] tmp = new int[2 * array.length];
        System.arraycopy(array, 1, tmp, 1,array.length - 1);
        array = tmp;
    }

    public int pullHighest() throws NoSuchElementException {
        // Return and remove element with highest priority
        if (size==0){
            throw new NoSuchElementException();
        }
        //remove the last to the first
        int highest = array[1];
        int temp = array[size];
        array[1] = temp;
        array[size] = 0;

        int parent = 1;
        int leftChild = parent*2;
        int rightChild = parent*2+1;

        int indexNew;
        if (array[leftChild]>array[rightChild]){
            indexNew = leftChild;
            parent = indexNew;
        }
        else
            indexNew = rightChild;

        //child is bigger than parent
        while (array[parent]<array[indexNew]){
            swap(parent,indexNew);
            if (rightChild <= size) {
                if (array[leftChild] > array[rightChild]){
                    indexNew = leftChild;
                }
                else
                    indexNew = rightChild;
            }

            else if (leftChild <= size) {
                indexNew = leftChild;
            }
        }
        size--;
        return highest;

    }
    public int size() {
        // Current heap size
        return size;
    }
    public boolean isEmpty() {
        // True if heap is empty
        return size==0;
    }

}
