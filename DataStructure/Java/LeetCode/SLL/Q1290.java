package LeetCode.SLL;

// Convert Binary Number in a Linked List to Integer
public class Q1290 {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while(head.next != null){
            num = num * 2 +head.next.val;
            head = head.next;
        }
        return num;
    }
}
