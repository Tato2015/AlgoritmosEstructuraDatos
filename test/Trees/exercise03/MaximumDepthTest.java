package Trees.exercise03;

import Trees.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthTest {

    @Test
    public void maxDepthTest(){

        MaximumDepth maximumDepth = new MaximumDepth();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        assertEquals(3 , maximumDepth.maxDepth(root));
        root.left.left.left = new Node(8);
        assertEquals(4,maximumDepth.maxDepth(root));

    }

}