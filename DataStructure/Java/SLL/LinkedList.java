package SLL;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * LinkedList
 */
public class LinkedList<T> {

    public Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void addNode(T node) {
        Node<T> newNode = new Node<>(node);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public String printList() {
        if (head == null) {
            return "Empty Linked List";
        } else {
            StringBuilder sb = new StringBuilder();
            Node<T> current = head;
            while (current != null) {
                sb.append(current.getData()).append(" --> ");
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
                if (current.getData() == key) {
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
                if (current.getData() == key) {
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

    // remove duplicates
    public LinkedList<T> removeDuplicates(){
        LinkedList<T> ll = new LinkedList<>();
        ll.head = this.head;
        HashSet<T> set = new HashSet<>();
        Node<T> current = ll.head;
        while (current != null){
            set.add(current.getData());
            current = current.getNext();
        }
        ll.head = null;
        ArrayList<T> array = new ArrayList<>(set);
        for (int i = array.size()-1; i >=0 ; i--) {
            ll.addNode(array.get(i));
        }
        return ll;
    }

    public void removeDuplicatesSame(){
        if (head == null) return;
        Node<T> previous = head;
        Node<T> current = previous.getNext();
        while (current != null){
            Node<T> runner = head;
            while (runner != current){
                if(runner.getData() == current.getData()){
                    Node<T> temp = current.getNext();
                    previous.setNext(temp);
                    current = temp;
                    break;
                }
                runner = runner.getNext();
            }
            if(runner == current){
                previous = current;
                current = current.getNext();
            }
        }

    }

    // The LL should be sorted to invoke this method
    // assuming the linkedList is sorted
    // the solution is correct, just change the if statment to handle your case
    // not the optimal solution since I am  using generics

    public void insertNOrder(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        }else if(head.compareTo(data) > 0){
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
        else{
            Node<T> current = head;
            Node<T> next = head.getNext();

            while (next != null && current != null ){
                if(current.compareTo(data) < 0 && next.compareTo(data) > 0){
                    if(current.getData() == data){
                        newNode.setNext(current.getNext());
                        current.setNext(newNode);
                        return;
                    }else if(next.getData() == data){
                        newNode.setNext(next.getNext());
                        next.setNext(newNode);
                        return;
                    }
                        newNode.setNext(next);
                        current.setNext(newNode);
                        break;
                }
                current = current.getNext();
                next = next.getNext();
            }
            if(next == null){
                current.setNext(newNode);
            }
        }

    }
}