public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode("Saif");
        ll.addNode("Saif1");
        ll.addNode("Saif1");
        ll.addNode("Saif1");
        ll.addNode("Saif");
        System.out.println(ll.printList());
        LinkedList<String> ll2 = ll.removeDublicates();
        System.out.println(ll2.printList());
    }
}
