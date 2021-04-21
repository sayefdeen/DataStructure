package HackerRank.SLL;

public class InsertingANodeDLL {

    //  For your reference:

     static class DoublyLinkedListNode {
          int data;
          DoublyLinkedListNode next;
          DoublyLinkedListNode prev;

         public DoublyLinkedListNode(int data) {
            this.data = data;
         }
     }


    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode n = new DoublyLinkedListNode(data);
        if (head == null) {
            return n;
        }
        else if (data <= head.data) {
            n.next = head;
            head.prev = n;
            return n;
        }
        else {
            DoublyLinkedListNode rest = sortedInsert(head.next, data);
            head.next = rest;
            rest.prev = head;
            return head;
        }
    }
}
