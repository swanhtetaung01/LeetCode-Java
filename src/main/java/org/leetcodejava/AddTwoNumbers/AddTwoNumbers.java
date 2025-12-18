package org.leetcodejava.AddTwoNumbers;

public class AddTwoNumbers {

    ListNode l1;
    ListNode l2;

    public AddTwoNumbers(ListNode l1, ListNode l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = 0 + carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }
        if (carry == 1) {
            pointer.next = new ListNode(1);
        }
        return result.next;
    }
}
