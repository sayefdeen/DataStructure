package Tree.BST;

import java.util.ArrayList;

public class BST<T> {
    Node<T> root;

    public void insert(T value){
       root =  insertHelper(root,value);
    }

   public ArrayList<T> preOrder(){
       ArrayList<T> arrayList = new ArrayList<>();
       preOrderHelper(root,arrayList);
       return arrayList;
   }

   public ArrayList<T> inOrder(){
       ArrayList<T> arrayList = new ArrayList<>();
       inOrderHelper(root,arrayList);
       return arrayList;
   }

    public ArrayList<T> postOrder(){
        ArrayList<T> arrayList = new ArrayList<>();
        postOrderHelper(root,arrayList);
        return arrayList;
    }

    public boolean search(T key){
        Node<T> wanted = search(root,key);
        return wanted !=null;
    }

    public void delete(T key){
        delete(root,key);
    }

    private Node<T> delete(Node<T> current,T key){
        if(current == null){
            return null;
        }
        if(current.compareTo(key)<0){
            current.left = delete(current.left,key);
        }else if(current.compareTo(key) >0){
            current.right = delete(current.right,key);
        }else{
            if(current.right == null){
                return current.left;
            }else if(current.left == null){
                return current.right;
            }
            current.value =findMin(current.right) ;
            current.right = delete(current.right,current.value);
        }
        return current;
    }

    private T findMin(Node<T> current){
        T min = current.value;
        while (current.left != null){
            min = current.left.value;
            current = current.left;
        }
        return min;
    }

    // Helpers Methods, Recursion

    private Node<T> insertHelper(Node<T> current,T value){
        if(current == null){
              current =  new Node<>(value);
              return current;
        }
        if(current.compareTo(value)<0){
            current.right= insertHelper(current.right,value);
        }else{
            current.left =  insertHelper(current.left,value);
        }
      return current;
    }

    private void preOrderHelper(Node<T> current, ArrayList<T> arrayList){
        if(current == null) return;
        arrayList.add(current.value);
        preOrderHelper(current.left,arrayList);
        preOrderHelper(current.right,arrayList);
    }

    private void inOrderHelper(Node<T> current, ArrayList<T> arrayList){
        if(current == null) return;
        preOrderHelper(current.left,arrayList);
        arrayList.add(current.value);
        preOrderHelper(current.right,arrayList);
    }

    private void postOrderHelper(Node<T> current, ArrayList<T> arrayList){
        if(current == null) return;
        preOrderHelper(current.left,arrayList);
        preOrderHelper(current.right,arrayList);
        arrayList.add(current.value);
    }

    private Node<T> search(Node<T> current,T key){
        if(current == null){
            return null;
        }
        if(current.value.equals(key)){
            return current;
        }
        if(current.compareTo(key)<0){
           return search(current.right,key);
        }else{
            return search(current.left,key);
        }
    }
}
