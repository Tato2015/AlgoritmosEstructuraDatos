package ArraysStringsHashTables.excercise02;

/*
Dado un array de numeros enteros y un target, retorna los indices de dos
numeros para los que la suma de ambos sea igual al target.

Puedes asumir que hay solamente una solucion.

Ejemplo 1:
Input nums = [ 9,2,5,6 ], target = 7
Output : [ 1,2 ]
Explicacion: num[1] + num[2] == 7 , devolvemos [ 1,2 ]

Ejemplo 2:
Input : nums = [ 9,2,5,6 ] , target = 100
Output : null

[ -2 , 5  ]

 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum( int[] numbers , int target ){
        if( numbers == null || numbers.length < 2 ) return null;

        Map<Integer,Integer> map = new HashMap<>();
        int i1 = 0;
        int i2 = 0;
        boolean isNull = true;
        for(int i = 0; i < numbers.length ; i++){
            if( map.containsKey(numbers[i]) ) return new int[]{ i, map.get(numbers[i]) };
            int complement = target - numbers[i];
            map.put(complement , i);
        }
        return null;
    }

}
