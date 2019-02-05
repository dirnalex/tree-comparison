package com.task.tree_comparison;

import static com.task.tree_comparison.Trees.*;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        Node treeA = getTreeA();
        Node treeB = getTreeB();
        Node treeC = getTreeC();
        Node treeD = getTreeD();


        TreeComparator tc = new TreeComparator();

        System.out.println("Tree A and tree B are " + (!tc.compare(treeA, treeB) ? "not " : "") + "equal"); //expect true
        System.out.println("Tree A and tree C are " + (!tc.compare(treeA, treeC) ? "not " : "") + "equal"); //expect false
        System.out.println("Tree A and tree D are " + (!tc.compare(treeA, treeD) ? "not " : "") + "equal"); //expect false
    }
}
