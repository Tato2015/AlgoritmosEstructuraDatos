package LinkedLists.excercise05;

/*

Escribe un algoritmo que intercambie parejas de nodos adyacentes sin modificar el valor intero de
los nodos

Ejemplo:
    Input 1->2->4->6->8
    Output: 2->1->6->4->8


 */

import LinkedLists.Node;

public class SwapNodesInPairs {

    public static Node swapNodesInPairs( Node head ){
        if( head == null || head.next == null ) return head;

        Node tmp = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapNodesInPairs(tmp);
        return head;

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
