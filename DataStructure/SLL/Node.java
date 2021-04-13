/**
 * Node
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    // Setters and Getters

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T newdata) {
        this.data = newdata;
    }

    public void setNext(Node<T> newNode) {
        this.next = newNode;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';

    }
}