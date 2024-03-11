package StackQueues.exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParanthesisTest {

    @Test
    public void  queueWithStacksTest(){
        ValidParanthesis validParanthesis = new ValidParanthesis();
        assertTrue(validParanthesis.isValid("([]){}"));
        assertFalse(validParanthesis.isValid("({)}"));
    }


}