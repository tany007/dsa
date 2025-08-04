package org.example.Trees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        if(node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    // wrapper function to call the recursive printInorder
    void printInorder() {
        printInorder(root);
    }

    // Print Inorder without recursion
    void printInorderWithoutRecursion() {
        if (root == null) {
            return;
        }

        ArrayDeque<Node> stack = new ArrayDeque<>();
        Node currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            System.out.print(currentNode.key + " ");
            currentNode = currentNode.right;
        }
    }

    void printPreorder(Node node) {
        if(node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    // wrapper function to call the recursive printPreorder
    void printPreorder() {
        printPreorder(root);
    }

    // Print Preorder without recursion
    void printPreorderWithoutRecursion() {
        if(root == null) {
            return;
        }

        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node currentNode = stack.pop();
            System.out.print(currentNode.key + " ");

            // Push right child first so that left child is processed first
            if(currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if(currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }

    void printPostOrder(Node node) {
        if(node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    // wrapper function to call the recursive printPostOrder
    void printPostOrder() {
        printPostOrder(root);
    }

    // Print Postorder without recursion
    void printPostOrderWithoutRecursion() {
        if(root == null) {
            return;
        }

        ArrayDeque<Node> stack = new ArrayDeque<>();
        ArrayDeque<Node> output = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node currentNode = stack.pop();
            output.push(currentNode);

            // Push left child first so that right child is processed first
            if(currentNode.left != null) {
                stack.push(currentNode.left);
            }
            if(currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }

        while(!output.isEmpty()) {
            System.out.print(output.pop().key + " ");
        }
    }

    int height(Node node) {
        if(node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left, right) + 1;
    }

    // wrapper function to call the recursive height
    int height() {
        return height(root);
    }

    //Print Nodes at K distance from root
    public void printKDistanceNodesFromRoot(Node root, int k) {
        if(root == null || k < 0) {
            return;
        }
        int n = height(root);
        if(k >= n) {
            System.out.println("No nodes at distance " + k + " from root");
            return;
        }
        if(k==0) {
            System.out.print (root.key+" ");
            return;
        }
        printKDistanceNodesFromRoot(root.left, k-1);
        printKDistanceNodesFromRoot(root.right, k-1);
    }

    //Print Nodes at K distance from the given node
    public void printKDistanceNodesFromNode(Node node, Node target, int k) {
        if(node == null || k < 0) {
            return;
        }
        if(node == target) {
            printKDistanceNodesFromRoot(node, k);
            return;
        }
        printKDistanceNodesFromNode(node.left, target, k);
        printKDistanceNodesFromNode(node.right, target, k);
    }

    //Level order traversal using Queue
    public void printLevelOrder() {
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }

            if(tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public int size(Node node) {
        if(node == null){
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    // wrapper function to call the recursive size
    public int size() {
        return size(root);
    }

    public int findMax(Node node) {
        if(node ==null) {
            return Integer.MIN_VALUE;
        }
        int res = node.key;
        int left = findMax(node.left);
        int right = findMax(node.right);

        if(left > res) {
            res = left;
        }
        if(right > res) {
            res = right;
        }
        if(node.key > res) {
            res = node.key;
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        //  Node root2 = null; // This will create an empty tree

        BinaryTree tree = new BinaryTree();
        tree.root = root;
        System.out.print("Inorder traversal of binary tree is: ");
        tree.printInorder();
        System.out.println();

        System.out.print("Inorder traversal without recursion: ");
        tree.printInorderWithoutRecursion();
        System.out.println();

        System.out.print("Preorder traversal of binary tree is: ");
        tree.printPreorder();
        System.out.println();

        System.out.print("Preorder traversal without recursion: ");
        tree.printPreorderWithoutRecursion();
        System.out.println();

        System.out.print("Postorder traversal of binary tree is: ");
        tree.printPostOrder();
        System.out.println();

        System.out.print("Postorder traversal without recursion: ");
        tree.printPostOrderWithoutRecursion();
        System.out.println();

        System.out.print("Height of the binary tree is: " + tree.height());
        System.out.println();

        System.out.print("Nodes at distance 2 from root: ");
        tree.printKDistanceNodesFromRoot(root, 2);
        System.out.println();

        System.out.print("Nodes at distance 1 from node 30: ");
        tree.printKDistanceNodesFromNode(root, root.right, 1);
        System.out.println();

        System.out.print("Level order traversal of binary tree is: ");
        tree.printLevelOrder();
        System.out.println();

        System.out.print("Size of the binary tree is: " + tree.size(tree.root));
        System.out.println();

        System.out.print("Maximum value in the binary tree is: " + tree.findMax(tree.root));
    }
}
