package ejercicio02;

import ArraysStringsHashTables.excercise02.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void twoSumTest(){
        int[] array = new int[]{9,2,5,6};
        int[] result = TwoSum.twoSum(array,7);
        assertTrue( ( result[0] == 1 && result[1] == 2 ) ||
                (result[0] == 2 && result[1] == 1));
        assertNull( TwoSum.twoSum(array, 50) );
    }

}