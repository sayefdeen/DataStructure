package SLL;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode("Aaif");
        ll.addNode("Baif1");
        ll.addNode("Daif1");
        ll.addNode("Eaif1");
        ll.addNode("Faif1");
        System.out.println(ll.printList());
        ll.insertNOrder("Daif1");
        System.out.println(ll.printList());
    }
}
