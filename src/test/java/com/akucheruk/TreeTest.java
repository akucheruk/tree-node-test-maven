package com.akucheruk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TreeTest {

    @Test
    public void findTestWithOneElement() {
        Tree tree = new Tree();
        tree.insert(1, "1_data");

        Node node = tree.find(1);
        assertNotNull(node);
        assertEquals("1_data", node.data);
    }

    @Test
    public void findTestWithThreeElements() {
        Tree tree = new Tree();
        tree.insert(1, "1_data");
        tree.insert(4, "4_data");
        tree.insert(2, "2_data");

        Node node = tree.find(1);
        assertNotNull(node);
        assertEquals("1_data", node.data);

        node = tree.find(4);
        assertNotNull(node);
        assertEquals("4_data", node.data);

        node = tree.find(2);
        assertNotNull(node);
        assertEquals("2_data", node.data);
    }
}
