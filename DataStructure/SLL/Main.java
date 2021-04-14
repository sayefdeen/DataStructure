public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode("Aaif");
        ll.addNode("Baif1");
        ll.addNode("Daif1");
        ll.addNode("Eaif1");
        ll.addNode("Faif");
        System.out.println(ll.printList());
        ll.insertNOrder("Ehmad");
        System.out.println(ll.printList());
    }
}
