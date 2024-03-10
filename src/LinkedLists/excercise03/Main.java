package LinkedLists.excercise03;

import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {

        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);

        Node result = NthNodeToLast.nthNodeToLast(list,3);
        NthNodeToLast.print(result);

    }

}
