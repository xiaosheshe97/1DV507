package Priority;

public class Main {
    public static void main(String[] args) {
        BinaryHeapQueue binaryHeapQueue = new BinaryHeapQueue();
        Task t1 = new WorkTask(4,"eat");
        binaryHeapQueue.insert(t1);
        Task t2 = new WorkTask(1,"wake up");
        binaryHeapQueue.insert(t2);
        Task t3 = new WorkTask(2,"wash");
        binaryHeapQueue.insert(t3);

        System.out.println(binaryHeapQueue.pullHighest().get());
        System.out.println(binaryHeapQueue.peekHighest().get());
        System.out.println(binaryHeapQueue.peekHighest().get());

    }
}
