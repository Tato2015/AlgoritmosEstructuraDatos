package LinkedLists.exercise02;

import LinkedLists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoSortedListsTest(){
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(5);

        Node result = MergeTwoSortedLists.mergeTwoLists(list1,list2);
        assertEquals(1,result.value);
        assertEquals(2,result.next.value);
        assertEquals(2,result.next.next.value);
        assertEquals(3,result.next.next.next.value);
        assertEquals(4,result.next.next.next.next.value);
        assertEquals(5,result.next.next.next.next.next.value);
        assertEquals(6,result.next.next.next.next.next.next.value);

    }

}