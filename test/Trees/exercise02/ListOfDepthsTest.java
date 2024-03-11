package Trees.exercise02;

import Trees.Node;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOfDepthsTest {

    @Test
    public void listOfDepthsTest(){

        ListOfDepths listOfDepths = new ListOfDepths();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        List<LinkedList<Node>> result = listOfDepths.listOfDepths(root);

        assertEquals(4, result.get(0).get(0).value);
        assertEquals(2,result.get(1).get(0).value);
        assertEquals(7,result.get(1).get(1).value);
        assertEquals(1,result.get(2).get(0).value);
        assertEquals(3,result.get(2).get(1).value);
        assertEquals(6,result.get(2).get(2).value);
        assertEquals(9,result.get(2).get(3).value);


    }

}