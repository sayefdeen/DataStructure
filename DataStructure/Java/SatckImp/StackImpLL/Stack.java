package SatckImp.StackImpLL;

public class Stack<T> {

    private Node<T> top;

    void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    String display(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = top;
        while (current != null){
            sb.append(current.data).append(" --> ");
            current = current.next;
        }
        sb.append("NULL");
        return sb.toString();
    }

    T peek(){
        return top.data;
    }

    T pop(){
        T wanted = top.data;
        top = top.next;
        return wanted;
    }

    boolean isEmpty(){
        return top == null;
    }
}
