package com.sparta.sonam.sortmanager.sorters.binarysorttree;

public class BinarySearchTree {
    private final Node rootNode;
    private int positionInArray;
    private int[] sortedArray;

    public BinarySearchTree(final int value) {
        rootNode = new Node(value);
    }

    public int[] getBST_SortedArray(int[] arrayToSort) {
        sortedArray = new int[arrayToSort.length];

        insertNodesIntoTree(arrayToSort);

        traverseTree(rootNode);

        return sortedArray;
    }

    private void insertNodesIntoTree(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            addNodeIntoTree(rootNode, arrayToSort[i]);
        }
    }

    private void addNodeIntoTree(Node rootNode, int value) {
        if (value == rootNode.getValue()&&rootNode.getKey()==0){
            int nodeKey = rootNode.getKey();
            rootNode.setKey(++nodeKey);
            return;
        }
        if (value < rootNode.getValue()) {
            if (rootNode.isLeftChildEmpty()) {
                rootNode.setLeftChild(new Node(value));
                int nodeKey = rootNode.getLeftChild().getKey();
                rootNode.getLeftChild().setKey(++nodeKey);
            } else {
                addNodeIntoTree(rootNode.getLeftChild(), value);
            }
        } else if (value >= rootNode.getValue()) {
            if (rootNode.isRightChildEmpty()) {
                rootNode.setRightChild(new Node(value));
                int nodeKey = rootNode.getRightChild().getKey();
                rootNode.getRightChild().setKey(++nodeKey);
            } else {
                addNodeIntoTree(rootNode.getRightChild(), value);
            }
        }
    }

    private void traverseTree(Node rootNode) {
        Node node = rootNode.getLeftChild();
        if (node != null) {
            traverseTree(node);
        }
        addCurrentNode(rootNode);
        node = rootNode.getRightChild();
        if (node != null) {
            traverseTree(node);
        }
    }

    private void addCurrentNode(Node node) {
        sortedArray[positionInArray] = node.getValue();
        positionInArray++;
    }
}
