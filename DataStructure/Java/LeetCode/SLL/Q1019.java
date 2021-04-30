package LeetCode.SLL;

import java.util.ArrayList;
import java.util.Stack;

public class Q1019 {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> nodesValues = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            nodesValues.add(current.val);
            current = current.next;
        }

        int[] outPut = new int[nodesValues.size()];
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i < nodesValues.size(); i++) {

            while (!indexes.isEmpty() && nodesValues.get(indexes.peek()) < nodesValues.get(i)) {
                outPut[indexes.pop()] = nodesValues.get(i);
            }
            indexes.push(i);
        }

        return outPut;
    }
}
