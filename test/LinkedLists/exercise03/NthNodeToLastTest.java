package LinkedLists.exercise03;

import LinkedLists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthNodeToLastTest {

    @Test
    public void nthNodeToLastTest(){

        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);

        Node result = NthNodeToLast.nthNodeToLast(list,1);
        assertNotNull(result);
        assertEquals(6, result.value);


    }

}