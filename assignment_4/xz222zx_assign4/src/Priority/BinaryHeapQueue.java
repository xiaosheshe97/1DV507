package Priority;

import java.util.NoSuchElementException;

public class BinaryHeapQueue implements PriorityQueue {
    private int size;
    private Task[] tasks;


    public BinaryHeapQueue() {
        // Constructs an empty heap
        size = 1;
        tasks = new Task[10];
    }

    @Override
    public void insert(Task t) {
        if (size == 1) {
            tasks[size] = t;
            size++;
        } else  {
            //resize if full
            if (size >= tasks.length-1){
                resize();
            }
            tasks[size++] = t;
            int child = size - 1;
            int parent = child/2;
            while (child > 1 && tasks[child].getPriority()<=tasks[parent].getPriority()){
                swap(child,parent);
                child = parent;
            }
        }

    }

    public void resize(){
        Task[] tmp = new Task[2 * tasks.length];
        System.arraycopy(tasks, 1, tmp, 1,tasks.length - 1);
        tasks = tmp;
    }
    private void swap(int i, int j) {
        Task temp = tasks[i];
        tasks[i] = tasks[j];
        tasks[j] = temp;
    }

    @Override
    public Task pullHighest() {
        // Return and remove element with highest priority
        if (size==1){
            throw new NoSuchElementException();
        }
        //remove the last to the first
        Task highest = tasks[1];
        Task temp = tasks[size-1];
        tasks[1] = temp;
        tasks[size--] = null;


        int parent = 1;
        int leftChild = parent*2;
        int rightChild = parent*2+1;


        int indexNew;
        if (leftChild<size&& rightChild<size){
            if (tasks[leftChild].getPriority()<tasks[rightChild].getPriority()){
                indexNew = leftChild;
                parent = indexNew;
            }
            else
                indexNew = rightChild;

            //child is smaller than parent
            while (tasks[parent].getPriority()>tasks[indexNew].getPriority()){
                swap(parent,indexNew);
                if (rightChild <= size) {
                    if (tasks[leftChild].getPriority() < tasks[rightChild].getPriority()){
                        indexNew = leftChild;
                    }
                    else
                        indexNew = rightChild;
                }

                else if (leftChild <= size) {
                    indexNew = leftChild;
                }
            }
        }

        size--;
        return highest;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size<=1;
    }

    @Override
    public boolean contain(Task t) {
        for (Task a:tasks) {
            if (a == t)
                return true;
        }
        return false;
    }

    @Override
    public Task peekHighest() {
        if (size == 0)
            throw new IllegalArgumentException("The tree is enpty");
        return tasks[1];
    }
}
