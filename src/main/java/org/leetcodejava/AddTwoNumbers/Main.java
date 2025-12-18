package org.leetcodejava.AddTwoNumbers;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length of the first List: ");
        int a1_length = scanner.nextInt();
        System.out.println("Values: ");
        int[] a1 = new int[a1_length];
        for (int i = 0; i < a1_length; i++) {
            a1[i] = scanner.nextInt();
        }
        System.out.println("Enter array length of the second List: ");
        int a2_length = scanner.nextInt();
        System.out.println("Values: ");
        int[] a2 = new int[a2_length];
        for (int i = 0; i < a2_length; i++) {
            a2[i] = scanner.nextInt();
        }

        ListNode l1 = arrayToListNode(a1);
        ListNode l2 = arrayToListNode(a2);
        AddTwoNumbers add = new AddTwoNumbers(l1, l2);
        ListNode result = add.addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        while (result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static ListNode arrayToListNode(int[] array){
        ListNode temp = new ListNode(0);
        ListNode pointer = temp;
        for (int i : array){
            pointer.next = new ListNode(i);
            pointer = pointer.next;
        }
        return temp.next;
    }
}
