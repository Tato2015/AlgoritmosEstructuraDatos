package LinkedLists.excercise04;

import LinkedLists.Node;

/*

Escribe un algoritmo que realice la suma de dos listas que representan
dos enteros positivos. Las listas estan en posicion invertida.

Ejemplo:
    Input : 1->2->4->6 , 5->2->8
    Output: 6->4->2->7
    6421 + 825 = 7246

 */

public class AddTwoNumbers {

    public static Node addTwoNumbers( Node list1, Node list2 ){

        Node result = new Node(-1);
        Node current = result;
        int carry = 0;

        while( list1 != null || list2 != null ){

            current.next = new Node(-1);
            current = current.next;
            int digit = carry;

            if( list1 != null ){
                digit += list1.value;
                list1 = list1.next;
            }

            if( list2 != null ){
                digit += list2.value;
                list2 = list2.next;
            }
            carry = digit / 10;
            digit = digit % 10;

            current.value = digit;

        }

        if( carry > 0 ){
            current.next = new Node(carry);
        }

        return  result.next;
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
