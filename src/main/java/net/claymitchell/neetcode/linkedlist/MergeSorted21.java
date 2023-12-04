package net.claymitchell.neetcode.linkedlist;

public class MergeSorted21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode head = null;
        ListNode prev = null;
        while(list1 != null || list2 != null) {
            int nextVal;

            if(list2 == null) {
                nextVal = list1.val;
                list1 = list1.next;
            } else if (list1 == null) {
                nextVal = list2.val;
                list2 = list2.next;
            } else {
                if(list1.val <= list2.val) {
                    nextVal = list1.val;
                    list1 = list1.next;
                } else {
                    nextVal = list2.val;
                    list2 = list2.next;
                }
            }

            if(head == null) {
                head = new ListNode(nextVal);
                prev = head;
            } else {
                prev.next = new ListNode(nextVal);
                prev = prev.next;
            }
        }
        return head;
    }
}
