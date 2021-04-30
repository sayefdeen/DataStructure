package LeetCode.SLL;

public class Q1721 {
    public ListNode swapNodes(ListNode head, int k) {
        if(head!= null && head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 1; i< k; i++){
            fast = fast.next;
        }
        ListNode first = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode second = slow;

        // swapping
        int temp = second.val;
        second.val = first.val;
        first.val = temp;
        return head;
    }
}
