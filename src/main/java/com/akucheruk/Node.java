package com.akucheruk;

import java.util.Objects;

public class Node {
    public int key;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void printNode() {
        System.out.println("KEY " + key + " DATA: " + data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
