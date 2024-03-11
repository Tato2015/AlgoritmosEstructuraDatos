package LinkedLists.exercise01;

import LinkedLists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Test
    public void removeDupsTest(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);

        RemoveDups.removeDups(head);

        assertEquals(1,head.value);
        assertEquals(2,head.next.value);
        assertEquals(3,head.next.next.value);
        assertEquals(4,head.next.next.next.value);

    }


}