package LeetCode.SLL;

import java.util.Stack;

public class Q445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = fillStack(l1);
        Stack<Integer> stack2 = fillStack(l2);
        ListNode head = null;
        int carry = 0;

        while( !stack1.isEmpty() || !stack2.isEmpty()  || carry !=0 ){
            int sum  = carry;
            if(!stack1.isEmpty()) sum+=stack1.pop();
            if(!stack2.isEmpty()) sum+=stack2.pop();

            ListNode newNode = new ListNode(sum%10);
            newNode.next = head;
            head = newNode;
            carry = sum /10;
        }
        return head;

    }

    public Stack<Integer> fillStack(ListNode l1){
        Stack<Integer> stack = new Stack<Integer>();
        while(l1 != null){
            stack.add(l1.val);
            l1 = l1.next;
        }
        return stack;
    }
}
