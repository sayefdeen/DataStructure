package QueueImp.QueueImpLL;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    T dequeue(){
     T removed = head.data;
     head = head.next;
     if(head == null) {
         tail = null;
     }
     return removed;
    }

    T peek(){
        return head.data;
    }

    boolean isEmpty(){
        return head == null;
    }

    int length(){
        int counter = 0;
        Node<T> current = head;
        while (current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    String display(){
        if(head == null){
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null){
            sb.append(current.data).append(" --> ");
            current = current.next;
        }
        return sb.append("Null").toString();
    }
}
