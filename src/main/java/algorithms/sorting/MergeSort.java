package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public void sort(List<Integer> nums)
    {
        int n = nums.size();

        if (n < 2)
            return;

        // Split the list into two parts.
        List<Integer> left = nums.subList(0, n / 2);
        List<Integer> right = nums.subList(n / 2, n);

        // Sort each part recursively.
        sort(left);
        sort(right);

        // Merge the sorted parts into one list.
        ArrayList<Integer> merged = new ArrayList<>();
        int il = 0, ir = 0;
        while (il < left.size() && ir < right.size())
        {
            if (left.get(il) <= right.get(ir))
            {
                merged.add(left.get(il++));
                continue;
            }
            merged.add(right.get(ir++));
        }
        while (il < left.size())
            merged.add(left.get(il++));
        while (ir < right.size())
            merged.add(right.get(ir++));

        for (int i = 0; i < nums.size(); i++)
        {
            nums.set(i, merged.get(i));
        }
    }
}
