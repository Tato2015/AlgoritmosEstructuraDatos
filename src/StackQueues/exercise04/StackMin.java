package StackQueues.exercise04;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ¿ Cómo diseñarias un stack que además de las operaciones de push y pop
 * tambien contase con una operacion para obtener el minimo
 *
 *
 *
 */
public class StackMin {

    private Deque<Integer> valueStack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    public void push( Integer data ){
        valueStack.push(data);
        if( minStack.isEmpty() || data < minStack.peek() ){
            minStack.push(data);
        }
    }

    public int pop(){
        int value = valueStack.pop();
        if( value ==  minStack.peek() ){
            minStack.pop();
        }
        return value;
    }

    public int min(){
        return minStack.peek();
    }

}
