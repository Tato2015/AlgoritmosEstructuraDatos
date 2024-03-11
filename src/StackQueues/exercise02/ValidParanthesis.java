package StackQueues.exercise02;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado un string que solamente contiene los caracteres "(" ")" "{" "}" "[" "]"
 * implementa un algoritmo para determinar si es válido
 *
 * Ejemplo 1 :
 * Input : "([]){}"
 *
 * Ouput : true
 *
 * Ejemplo 2:
 * Input : "({)}"
 * Output: false
 *
 *
 */
public class ValidParanthesis {

    public boolean isValid( String s ){
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if( c == '(' || c == '{' || c == '[' ){
                stack.push(getOpposite(c));
            }else{
                if( stack.isEmpty() || stack.pop() != c )
                    return false;
            }
        }

        return stack.isEmpty();

    }

    private Character getOpposite(char c) {
        if(  c == '(' ) return ')';
        if(  c == '{' ) return '}';
        if(  c == '[' ) return ']';
        return null;
    }


}
