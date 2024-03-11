package LinkedLists.exercise01;

/*

Escribe un algoritmo para eliminar los elementos duplicados en una lista enlazada

Ejemplo :
    Input : 1->2->2->3->4
    Output : 1->2->3->4

    Follow-up : ¿ Cuál sería tu solución si no pudieras utilizar memoria adicional ?


 */

import LinkedLists.Node;
import java.util.HashSet;

public class RemoveDups {

    public static void removeDups(Node head){
        if( head == null ) return;
        HashSet<Integer> foundValues = new HashSet<>();
        Node current = head;
        foundValues.add(current.value);


        while( current != null &&  current.next != null ){
            if( !foundValues.add(current.next.value) ){
                current.next = current.next.next;
            }
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
