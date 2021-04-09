public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addNode(new Node<String>("Saif"));
        ll.addNode(new Node<String>("Saif1"));
        System.out.println(ll.position("Saif1"));
        try {
            ll.deleteNode(ll.position("Saif"));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        String linkedListArray = ll.printList();
        System.out.println(linkedListArray);
    }
}
