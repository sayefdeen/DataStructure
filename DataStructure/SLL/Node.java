/**
 * Node
 */
public class Node<T> implements Comparable<T> {
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

    @Override
    public int compareTo(T o) {
        if (o instanceof String) {
            String data = (String) this.getData();
            if (data.compareTo((String) o) >= 0) {
                return 1;
            }

        }
        return -1;
    }
}