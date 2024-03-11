package StackQueues.exercise03;

import java.util.ArrayDeque;
import java.util.Deque;

/*

Ordena un stack de forma que los elementos más pequeños queden en el tope del stack
Puedes usar un stack adicional, pero no está permitido copiar los elementos a otra
estructura de dtos

Ejemplo:
    Input ( tope ) 5->1->4->2
    Output: ( tope ) 1->2->4->5

 */
public class SortStack {

    public Deque<Integer> sort( Deque<Integer> stack ){
        Deque<Integer> sortedStack = new ArrayDeque<>();
        while( !stack.isEmpty() ){
            Integer element = stack.pop();
            while( !sortedStack.isEmpty() && element > sortedStack.peek() ){
                stack.push(sortedStack.pop());
            }
            sortedStack.push(element);
        }
        return  sortedStack;


//        while( !stack.isEmpty() ){
//            if( response.isEmpty() ){
//                response.push(stack.pop());
//                continue;
//            }
//
//            if( response.peek() < stack.peek() ){
//                Integer aux = response.pop();
//                response.push(stack.pop());
//                stack.push(aux);
//            }
//            response.push(stack.pop());
//        }
//        return  response;
    }

}
