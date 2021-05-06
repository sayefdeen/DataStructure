package LeetCode.SLL;

public class Q142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head, target = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (target != slow) {
                    slow= slow.next;
                    target = target.next;
                }
                return target;
            }
        }
        return null;
    }
}
