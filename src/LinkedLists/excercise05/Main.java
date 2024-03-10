package LinkedLists.excercise05;

import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);
        list1.next.next.next.next = new Node(8);

        Node result = SwapNodesInPairs.swapNodesInPairs(list1);
        SwapNodesInPairs.print(result);


    }

}
