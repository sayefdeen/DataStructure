package HackerRank.SLL;

import SLL.LinkedList;
import SLL.Node;

public class Prob {
    public static void main(String[] args) {
        LinkedList<Integer> sll1 = new LinkedList<>();
        LinkedList<Integer> sll2 = new LinkedList<>();
        for (int i = 1; i <=10 ; i++) {
            if(i %2 ==0) sll1.addNode(i);
            else sll2.addNode(i);
        }
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.head = mergeSorted(sll1,sll2);
        System.out.println(newLL.printList());
    }

    public static Node<Integer> mergeSorted(LinkedList<Integer> ll1,LinkedList<Integer> ll2){
        Node<Integer> dummy = new Node<>(-1);
        Node<Integer> head = dummy;
        Node<Integer> currentOne = ll1.getHead();
        Node<Integer> currentTwo = ll2.getHead();
        while (currentOne!=null && currentTwo!=null){
            if(currentOne.getData() <= currentTwo.getData()){
                dummy.setNext(currentOne);
                currentOne = currentOne.getNext();
            }else{
                dummy.setNext(currentTwo);
                currentTwo = currentTwo.getNext();
            }
            dummy = dummy.getNext();
        }
        if(currentOne != null){
            dummy = currentOne;
        }else{
            dummy = currentTwo;
        }
        return head.getNext();
    }
}
