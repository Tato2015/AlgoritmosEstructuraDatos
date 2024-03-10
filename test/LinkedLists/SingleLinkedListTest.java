package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {

    @Test
    public void test(){
        SingleLinkedList list = new SingleLinkedList();
        list.print();
        list.appendToTotal(1);
        list.appendToTotal(2);
        list.appendToTotal(3);
        list.print();
        list.appendToTotal(4);
        list.appendToTotal(5);
        list.print();
        list.deleteNode(3);
        list.print();
        list.deleteNode(5);
        list.print();


    }

}