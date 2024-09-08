package algorithms.practice.leetcode;
import algorithms.practice.leetcode.model.ListNode;

public class LC0021MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode list3tmp = list3;

        while (list1 != null && list2 != null)
        {
            if (list2.val < list1.val)
            {
                list3tmp.next = list2;
                list2 = list2.next;
            }
            else
            {
                list3tmp.next = list1;
                list1 = list1.next;
            }
            list3tmp = list3tmp.next;
        }

        if (list1 == null)
            list3tmp.next = list2;
        else if (list2 == null)
            list3tmp.next = list1;

        return list3.next;
    }
}
