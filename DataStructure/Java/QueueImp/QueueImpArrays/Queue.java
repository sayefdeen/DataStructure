package QueueImp.QueueImpArrays;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<Node<T>> list = new ArrayList<>();
    int position = 0;

    void enqueue(T data){
        list.add(position,new Node<>(data));
        position++;
    }

    T dequeue(){
        position--;
     return  list.remove(0).data;
    }

    T peek(){
        return list.get(0).data;
    }

    boolean isEmpty(){
        return list.size() == 0;
    }

    int length(){
        return list.size();
    }

    String display(){
        if(list.size() == 0){
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        for (Node<T> node:list ) {
            sb.append(node.data).append(" --> ");
        }
        return sb.append("Null").toString();
    }
}
