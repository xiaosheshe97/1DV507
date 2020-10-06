package Exercise6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {
    private static int testCount = 0;
    @BeforeEach
    public void setTestCount(){
        testCount ++;
        System.out.println("Test " + testCount);
    }

    @AfterEach
    public void tearDown() {
        System.out.println(" --- done with test "+ testCount);
    }

    @Test
    void insertionSort() {
        //zero element
        int[] arr1 = new int[0];
        SortingAlgorithms.insertionSort(arr1);
        for (int i=0; i<arr1.length-1;i++)
            assertTrue( arr1[i] <= arr1[i+1] );
        //one element
        int[] arr2 = {1};
        for (int i=0; i<arr2.length-1;i++)
            assertTrue( arr2[i] <= arr2[i+1] );
        //many element
        int[] arr3 = random(100,100); // Random array of size 100
        SortingAlgorithms.insertionSort(arr3);
        for (int i=0; i<arr3.length-1;i++)
            assertTrue( arr3[i] <= arr3[i+1] );
    }

    @Test
    void testInsertionSort() {
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        //zero element
        String[] arr1 = new String[0];
        SortingAlgorithms.insertionSort(arr1,Alphabetic);
        for (int i=0; i<arr1.length-1;i++)
            assertTrue(Alphabetic.compare(arr1[i],arr1[i+1])<=0);
        //one element
        String[] arr2 = {"a"};
        SortingAlgorithms.insertionSort(arr2,Alphabetic);
        for (int i=0; i<arr2.length-1;i++)
            assertTrue(Alphabetic.compare(arr2[i],arr2[i+1])<=0);
        //many element
        String[] arr3 = new String[]{"a", "D", "hello","world", "yellow", "Red", "green", "Blue", "grey"};
        SortingAlgorithms.insertionSort(arr3,Alphabetic);
        for (int i=0; i<arr3.length-1;i++)
            assertTrue(Alphabetic.compare(arr3[i],arr3[i+1])<=0);
    }

    @Test
    void mergeSort() {
        //zero element
        int[] arr1 = new int[0];
        SortingAlgorithms.insertionSort(arr1);
        for (int i=0; i<arr1.length-1;i++)
            assertTrue( arr1[i] <= arr1[i+1] );
        //one element
        int[] arr2 = {1};
        for (int i=0; i<arr2.length-1;i++)
            assertTrue( arr2[i] <= arr2[i+1] );
        //many element
        int[] arr3 = random(100,100); // Random array of size 100
        SortingAlgorithms.insertionSort(arr3);
        for (int i=0; i<arr3.length-1;i++)
            assertTrue( arr3[i] <= arr3[i+1] );
    }

    @Test
    void testMergeSort() {
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        //zero element
        String[] arr1 = new String[0];
        SortingAlgorithms.insertionSort(arr1,Alphabetic);
        for (int i=0; i<arr1.length-1;i++)
            assertTrue(Alphabetic.compare(arr1[i],arr1[i+1])<=0);
        //one element
        String[] arr2 = {"a"};
        SortingAlgorithms.insertionSort(arr2,Alphabetic);
        for (int i=0; i<arr2.length-1;i++)
            assertTrue(Alphabetic.compare(arr2[i],arr2[i+1])<=0);
        //many element
        String[] arr3 = new String[]{"a", "D", "hello","world", "yellow", "Red", "green", "Blue", "grey"};
        SortingAlgorithms.insertionSort(arr3,Alphabetic);
        for (int i=0; i<arr3.length-1;i++)
            assertTrue(Alphabetic.compare(arr3[i],arr3[i+1])<=0);
    }
    private int[] random(int size,int max) { // Private help method
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i=0;i<size;i++) { // "size" elements
            arr[i] =1+rnd.nextInt(max); // in range [1,max]
        }
        return arr;
    }


}