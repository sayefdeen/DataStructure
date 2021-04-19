package Problems.SLL;

// This is a Problem from hacker rank name Get Node Value

public class GetNodeValue {

     // For your reference:

      class SinglyLinkedListNode {
          int data;
         SinglyLinkedListNode next;
      }


    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode current = head;
        int counter = 0;

        while(head != null){
            head = head.next;
            if(counter <= positionFromTail){
                counter++;
            }else{
                current = current.next;
            }
            // In case the positionFromTail was beyond the length of the linked list
            if(counter < positionFromTail){
                return -1;
            }
        }
        return current.data;
    }
}
