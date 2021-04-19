package SLL;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        // first LL
        ll.addNode(1);
        ll.addNode(3);
        ll.addNode(7);
        ll.addNode(8);

        // second LL
        ll2.addNode(2);
        ll2.addNode(4);
        ll2.addNode(6);
        ll2.addNode(9);

        System.out.println(ll.printList());
    }
}
