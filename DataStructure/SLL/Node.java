/**
 * Node
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        next = null;
    }

    // Setters and Getters

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setValue(T newValue) {
        this.value = newValue;
    }

    public void setNext(Node<T> newNode) {
        this.next = newNode;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';

    }
}