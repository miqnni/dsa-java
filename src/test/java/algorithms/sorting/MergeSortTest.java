package algorithms.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void sort() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(7);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(3);
        b.add(7);
        b.add(7);

        MergeSort ms = new MergeSort();
        ms.sort(a);
        assertEquals(b, a);
    }
}