/**
 * LinkedList
 */
public class LinkedList<T> {

    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

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

    // insert At head

    public void insert(T node) {
        Node<T> newNode = new Node<T>(node);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    // Insert at a position

    public void insert(T node, int position) {
        Node<T> newNode = new Node<T>(node);
        if (head == null) {
            head = newNode;
        } else if (position == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            int counter = 0;
            Node<T> current = head;
            while (current.getNext() != null) {
                counter++;
                if (counter == position) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    break;
                }
                current = current.getNext();
            }
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

    // The Runner technique

    public boolean hasCycle(Node<T> node) {
        if (head == null) {
            return false;
        }
        Node<T> fast = head.getNext();
        Node<T> slow = head;
        while (fast != null && fast.getNext() != null && slow != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return false;
    }

    public void inverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Reverse using recursion
    // 0 -- next
    // 1 -- current
    // 2 -- prev
    public void recursionInverse(Node<T> next, Node<T> current, Node<T> prev) {
        if (current == null) {
            head = prev;
            return;
        }
        next = current.getNext();
        current.setNext(prev);
        prev = current;
        current = next;
        recursionInverse(next, current, prev);
    }

}