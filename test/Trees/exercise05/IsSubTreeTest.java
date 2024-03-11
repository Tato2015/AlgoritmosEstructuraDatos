package Trees.exercise05;

import Trees.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubTreeTest {

    @Test
    public void isSubTree(){
        IsSubTree isSubTree = new IsSubTree();
        Node first = new Node(4);
        first.left = new Node(5);
        first.right = new Node(7);
        first.left.left = new Node(1);
        first.left.right = new Node(3);
        first.left.left.left = new Node(8);

        Node second = new Node(5);
        second.left = new Node(1);
        second.right = new Node(3);
        second.left.left = new Node(8);
        assertTrue(isSubTree.isSubTree(first,second));
    }

}