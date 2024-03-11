package StackQueues.exercise03;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class SortStackTest {

    @Test
    public void sortTest(){
        Deque<Integer> deque = new ArrayDeque<>();
        //5->1->4->2
        deque.push(2);
        deque.push(4);
        deque.push(1);
        deque.push(5);

        SortStack sortStack = new SortStack();
        Deque<Integer> response = sortStack.sort(deque);
        assertNotNull(response);
        assertEquals(1, response.pop() );
        assertEquals(2, response.pop() );
        assertEquals(4, response.pop() );
        assertEquals(5, response.pop() );
        assertEquals(0, response.size());


    }

}