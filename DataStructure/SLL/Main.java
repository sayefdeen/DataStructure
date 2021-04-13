public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode(new Node<String>("Saif"));
        ll.addNode(new Node<String>("Saif1"));
        System.out.println(ll.printList());
        ll.recursionInverse(null, ll.getHead(), null);
        System.out.println(ll.printList());
    }
}
