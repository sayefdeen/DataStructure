package HackerRank.SLL;

public class ReverseDLL {



      class DoublyLinkedListNode {
          int data;
          DoublyLinkedListNode next;
          DoublyLinkedListNode prev;
      }


    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null) return head;

        DoublyLinkedListNode current = head;
        DoublyLinkedListNode newHead = head;
        while(current != null){
            DoublyLinkedListNode prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            newHead = current;
            current = current.prev;

        }
        return newHead;
    }
}
