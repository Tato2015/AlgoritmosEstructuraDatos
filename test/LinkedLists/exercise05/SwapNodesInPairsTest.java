package LinkedLists.exercise05;

import LinkedLists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    @Test
    public void addTwoNubersTest(){
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);
        list1.next.next.next.next = new Node(8);

        Node result = SwapNodesInPairs.swapNodesInPairs(list1);

        assertEquals(2, result.value);
        assertEquals(1, result.next.value);
        assertEquals(6, result.next.next.value);
        assertEquals(4, result.next.next.next.value);
        assertEquals(8, result.next.next.next.next.value);

    }

}