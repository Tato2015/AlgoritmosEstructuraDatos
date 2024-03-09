package ArraysStringsHashTables.excercise01;

import java.util.HashSet;
import java.util.Set;

/*
Dado un metodo que recibe un String, comprobar si todos los caracteres son unicos o no.

isUnique("abcde") => true
isUnique("abcded") => false

a : b c d e
b : c d e
d : e

O(n^2)

Tabla Hash
abcded
a b c d e

for O(N)
Consulta la tabla O(1)

......

O(1)

 */
public class IsUnique {

    private static final int NUMBER_OF_CHARS = 128;

    public static boolean isUnique( String s ){
        if( s.length() > NUMBER_OF_CHARS )
            return false;

        Set<Character> characters = new HashSet<>();
        for( Character c : s.toCharArray() ){
            if( characters.contains(c) )
                return false;
            characters.add(c);
        }

        return true;
    }


}
