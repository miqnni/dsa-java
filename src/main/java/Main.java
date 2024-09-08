import algorithms.practice.leetcode.LC0021MergeTwoSortedLists;

import java.util.ArrayList;
import algorithms.sorting.MergeSort;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(7);

        MergeSort ms = new MergeSort();
        ms.sort(a);
        System.out.println(a);
    }
}
