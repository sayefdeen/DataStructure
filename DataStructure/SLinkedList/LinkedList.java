/**
 * LinkedList
 */
public class LinkedList<T> {

    private Node<T> head;

    public void addNode(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public String printList() {
        if (head == null) {
            return "Empty Linked List";
        } else {
            StringBuilder sb = new StringBuilder();
            Node<T> current = head;
            while (current != null) {
                sb.append(current.getValue() + " --> ");
                current = current.getNext();
            }
            sb.append("Null");
            return sb.toString();
        }
    }

    public void insertHead(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public boolean contain(T key) {
        if (head == null) {
            return false;
        } else {
            Node<T> current = head;
            while (current != null) {
                if (current.getValue() == key) {
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
    }

    public int position(T key) {
        if (head == null) {
            return -1;
        } else {
            int counter = 0;
            Node<T> current = head;
            while (current != null) {
                if (current.getValue() == key) {
                    return counter;
                }
                counter++;
                current = current.getNext();
            }
            return -1;
        }
    }

    public void deleteNode(int position) throws Exception {
        if (head == null) {
            throw new Exception("Empty LinkedList");
        } else if (position == 0) {
            head = head.getNext();
        } else {
            Node<T> current = head;
            int counter = 1;
            while (current.getNext() != null) {
                if (counter == position) {
                    current.setNext(current.getNext().getNext());
                    return;
                }
                counter++;
                current = current.getNext();
            }
            throw new Exception(position + " was Not Found");
        }
    }

}