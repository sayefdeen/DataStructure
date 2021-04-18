package SatckImp.StackImplArrays;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<Node<T>> list = new ArrayList<>();

    void push(T data){
        list.add(0,new Node<>(data));
    }

    String display(){
        if(list.size() ==0){
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        for (Node<T> node:list ) {
            sb.append(node.data).append(" --> ");
        }
        return sb.append("NULL").toString();
    }

    T peek(){
        return list.get(0).data;
    }

    T pop(){
       return list.remove(0).data;
    }

    boolean isEmpty(){
        return list.size() == 0;
    }
}
