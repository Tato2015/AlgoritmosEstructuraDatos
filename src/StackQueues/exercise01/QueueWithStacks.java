package StackQueues.exercise01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implementa una clase MyQueue utilizando dos stacks.
 * Como stack usaremos la Interfaz Deque, que proporciona las operaciones de una cola doblemente terminada
 * permitiendole usar como Pila o Cola ( solo las operaciones de Pila están permitidas en este ejercicio )
 * Java tembién tiene la clase Stack, pero su uso no está recomendado por extender de la clase Vector, que no
 * tiene demasiado sentido, y por ser una clase específica y no una interfaz. Si quieres saber más sobre
 * este tema puedes acceder al siguiente enlace:
 *
 */
public class QueueWithStacks {

    Deque<Integer> firstStack = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add( Integer value ){
        firstStack.push(value);
    }

    public Integer peek(){
        dumpElementsIntoSecondStack();
        return secondStack.peek();
    }

    public Integer remove(){
        dumpElementsIntoSecondStack();
        return secondStack.pop();
    }

    private void dumpElementsIntoSecondStack(){
        if( secondStack.isEmpty() ){
            while( !firstStack.isEmpty() ){
                secondStack.push(firstStack.poll());
            }
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return firstStack.size() + secondStack.size();
    }


}
