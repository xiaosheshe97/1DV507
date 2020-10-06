package xz222az_assign1.collection;

public class ArrayIntList extends AbstractIntCollection implements IntList {
    public ArrayIntList() {
    }

    @Override
    public void add(int n) {
        values [ size++] = n;
        if ( size == values.length) // increase size
            resize ();
    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        checkIndex(index,size);
        for (int i = size; i > index; i--){
            values[i] = values[i-1];
        }
        values[index] = n;
        size ++;
        if ( size == values.length) // increase size
            resize ();
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index , size );
        for ( int i=index;i<size; i++)
            values [ i ] = values[ i+1]; // Move one step forward
        size--;
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        checkIndex(index,size);
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for (int i = 0; i < size; i++){
            if (values[i] == n){
                return 1;
            }
        }
        return -1;
    }

}

