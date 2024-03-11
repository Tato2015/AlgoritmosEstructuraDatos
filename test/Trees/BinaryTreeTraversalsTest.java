package Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalsTest {

    @Test
    public void test(){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.left.left = new Node(7);
        root.left.right.left = new Node(8);

        System.out.println("IN ORDER TRAVERSAL : ");
        BinaryTreeTraversals.inOrderTraversal(root);
        System.out.println();

        System.out.println("PRE ORDER TRAVERSAL : ");
        BinaryTreeTraversals.preOrderTraversal(root);
        System.out.println();

        System.out.println("POST ORDER TRAVERSAL : ");
        BinaryTreeTraversals.postOrderTraversal(root);
        System.out.println();



    }

}