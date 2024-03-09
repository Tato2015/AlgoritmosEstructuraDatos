package ejercicio01;

import ArraysStringsHashTables.excercise01.IsUnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @Test
    public void isUniqueTest(){
        assertTrue(IsUnique.isUnique("abcde"));
        assertTrue(IsUnique.isUnique("aAbBcCdDeE"));
        assertFalse(IsUnique.isUnique("amar"));
    }

}