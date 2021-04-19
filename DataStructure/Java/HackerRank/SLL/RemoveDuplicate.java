package HackerRank.SLL;

public class RemoveDuplicate {


     // For your reference:

     class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
      }


    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode previous = head;
        SinglyLinkedListNode current = head.next;
        while(current != null){
            SinglyLinkedListNode runner = head;
            while(runner != current){
                if(runner.data == current.data){
                    SinglyLinkedListNode temp = current.next;
                    previous.next = temp;
                    current = temp;
                    break;
                }
                runner = runner.next;
            }
            if(runner == current){
                previous = current;
                current = current.next;;
            }
        }
        return head;
    }
}
