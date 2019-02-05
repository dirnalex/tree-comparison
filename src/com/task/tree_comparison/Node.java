package com.task.tree_comparison;

class Node {
    private Node child1;
    private Node child2;
    private int value;

    Node(int value, Node child1, Node child2) {
        this.value = value;
        this.child1 = child1;
        this.child2 = child2;
    }

    Node getChild1() {
        return child1;
    }

    void setChild1(Node child1) {
        this.child1 = child1;
    }

    Node getChild2() {
        return child2;
    }

    void setChild2(Node child2) {
        this.child2 = child2;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
