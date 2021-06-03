package Tree.BST;

public class Node<T> {
    T value;
    Node<T> right;
    Node<T> left;

    public Node(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int compareTo(T o) {
        if (o instanceof String) {
            String data = (String) this.value;
            if (data.compareTo((String) o) >= 0) {
                return 1;
            }

        } else if(o instanceof Integer){
            int data = (int) this.value;
            return data >= (Integer) o ? 1 : -1;
        }

        return -1;
    }
}
