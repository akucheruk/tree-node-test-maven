package com.akucheruk;

public class Tree {
    Node root;

    public void insert(int key, String data) {
        Node node = new Node();
        node.key = key;
        node.data = data;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev;
            while (true) {
                prev = current;
                if (key < prev.key) {
                    current = current.leftChild;
                    if (current == null) {
                        prev.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null){
                        prev.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int key) {
        return null;
    }

    public void print(Node startNode) {
    }
}
