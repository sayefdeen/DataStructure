package LeetCode.SLL;
// Delete Node in a Linked List
public class Q237 {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val  = temp.val;
        node.next = temp.next;
    }
}
