package Trees.exercise04;

import Trees.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    @Test
    public void validateBstTest(){
        ValidateBST validateBST = new ValidateBST();
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.left.left.left = new Node(8);
        assertFalse(validateBST.isValidBST(root));

        root.left.value = 2;
        root.left.left.left = null;

        assertTrue(validateBST.isValidBST(root));
    }

}