package LinkedLists.exercise02;

import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);

        Node list2 = new Node(2);
        list2.next = new Node(3);
        list2.next.next = new Node(5);

        Node result = MergeTwoSortedLists.mergeTwoLists(list1,list2);
        MergeTwoSortedLists.print(result);


    }

}
