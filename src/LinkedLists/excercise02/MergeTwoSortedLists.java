package LinkedLists.excercise02;

/*

Escribe un algoritmo para combinar dos listas enlzadas simples ordenadas
El resultado debe ser una unica lista enlazada odredenada. Devuelve su head.

Example :
    Input : 1->2->4->6 , 2->3->5
    Output : 1->2->2->3->4->5->6

    -1
    1
    2
    2
    3
    4
    5

    Current:  6
    Current next: null
    list1 :  null
    list2 : null
 */

import LinkedLists.Node;

public class MergeTwoSortedLists {

    public static Node mergeTwoLists(Node list1, Node list2){

        Node aux = new Node(-1);
        Node current = aux;

        while( list1 != null & list2 != null){

            if( list1.value <= list2.value ){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if( list1 == null ){
            appendToList( current, list2 );
        }else{
            appendToList( current, list1 );
        }

//        return aux.next;
        return aux.next;
    }

    private static void appendToList(Node current, Node listToAppend) {
        while( listToAppend != null ){
            current.next = listToAppend;
            listToAppend = listToAppend.next;
            current = current.next;
        }

    }

    public static void print(Node head){
        if( head == null ){
            System.out.println("END");
            return;
        }
        Node current = head;
        while( current.next != null ){
            System.out.print( current.value + " -> ");
            current = current.next;
        }
        System.out.println( current.value + " - " );
    }

}
