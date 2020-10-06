package Priority;

public interface PriorityQueue {
    void insert(Task t); // Add n to heap
    Task pullHighest();    // Return and remove element with highest priority
    int size();         // Current heap size
    boolean isEmpty(); // True if heap is empty
    boolean contain(Task t);
    Task peekHighest();
}
