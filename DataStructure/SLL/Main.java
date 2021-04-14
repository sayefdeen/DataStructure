public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode("Aaif");
        ll.addNode("Baif1");
        ll.addNode("Daif1");
        ll.addNode("Eaif1");
        ll.addNode("Faif");
        System.out.println(ll.printList());
        try {
            ll.insertNOrder("Ehmad");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(ll.printList());
    }
}
