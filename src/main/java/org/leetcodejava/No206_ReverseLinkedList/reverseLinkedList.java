package org.leetcodejava.No206_ReverseLinkedList;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode dummyNode = new ListNode();

        ListNode pointer = head;

        while(pointer != null) {

            ListNode nextNode = pointer.next;

            pointer.next = dummyNode.next;
            //n1 -> n2 -> n3 ->
            dummyNode.next = pointer;

            pointer = nextNode;
        }

        return dummyNode.next;
    }
}
