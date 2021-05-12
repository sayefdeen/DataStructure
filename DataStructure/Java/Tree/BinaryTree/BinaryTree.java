package Tree.BinaryTree;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public ArrayList<T> preOrder() {
        ArrayList<T> list = new ArrayList<>();
        preOrder(this.root, list);
        return list;
    }

    private void preOrder(Node<T> node, ArrayList<T> arrayList) {
        if (node != null) {
            arrayList.add(node.value);
            preOrder(node.left, arrayList);
            preOrder(node.right, arrayList);
        }
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> list = new ArrayList<>();
        inOrder(this.root, list);
        return list;
    }

    private void inOrder(Node<T> node, ArrayList<T> arrayList) {
        if (node != null) {
            inOrder(node.left, arrayList);
            arrayList.add(node.value);
            inOrder(node.right, arrayList);
        }

    }

    public ArrayList<T> postOrder() {
        ArrayList<T> list = new ArrayList<>();
        postOrder(this.root, list);
        return list;
    }

    private void postOrder(Node<T> node, ArrayList<T> arrayList) {
        if (node != null) {
            postOrder(node.left, arrayList);
            postOrder(node.right, arrayList);
            arrayList.add(node.value);
        }
    }
}
