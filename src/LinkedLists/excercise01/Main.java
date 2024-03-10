package LinkedLists.excercise01;

import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);



        RemoveDups.removeDups(head);
        RemoveDups.print(head);



    }

}
