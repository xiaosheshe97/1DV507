package binheap;

import static org.junit.jupiter.api.Assertions.*;

class BinaryIntHeapTest {

    @org.junit.jupiter.api.Test
    void insert() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(2);
        assertEquals(2,binaryIntHeap.pullHighest());

        binaryIntHeap.insert(3);
        assertEquals(2,binaryIntHeap.size());
    }

    @org.junit.jupiter.api.Test
    void pullHighest() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(4);
        binaryIntHeap.insert(6);
        assertEquals(6,binaryIntHeap.pullHighest());
        assertEquals(4,binaryIntHeap.pullHighest());
    }

    @org.junit.jupiter.api.Test
    void size() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(3);
        assertEquals(2,binaryIntHeap.size());
        binaryIntHeap.insert(5);
        assertEquals(3,binaryIntHeap.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(1);
        assertFalse(binaryIntHeap.isEmpty());
        binaryIntHeap.pullHighest();

    }
}